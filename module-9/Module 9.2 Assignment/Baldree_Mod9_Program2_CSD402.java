/**
 * Baldree_Mod9_Program2_CSD402
 * Alexander Baldree
 * 2/24/26
 * CSD402
 *
 * Description:
 * - Creates a file named "data.file" if it does not exist
 * - Writes 10 randomly generated integers separated by spaces
 *   OR appends 10 more integers if the file already exists
 * - Closes the file, reopens it, reads the contents, and displays them
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Baldree_Mod9_Program2_CSD402 {

    public static void main(String[] args) {
        Path filePath = Path.of("data.file");
        Random random = new Random();

        // Write or append 10 random numbers
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
                System.out.println("Created new file: data.file");
            } else {
                System.out.println("File already exists: data.file (will append)");
            }

            // If the file already has content, add a leading space before appending more numbers
            boolean needsLeadingSpace = Files.size(filePath) > 0;

            try (BufferedWriter writer = Files.newBufferedWriter(
                    filePath,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.APPEND
            )) {
                if (needsLeadingSpace) {
                    writer.write(" ");
                }

                for (int i = 0; i < 10; i++) {
                    int num = random.nextInt(100); // 0-99 (change if you want 1-100)
                    writer.write(Integer.toString(num));
                    if (i < 9) {
                        writer.write(" ");
                    }
                }
            }

            // Read and display file contents
            System.out.println("\nContents of data.file:");
            try (BufferedReader reader = Files.newBufferedReader(filePath)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}