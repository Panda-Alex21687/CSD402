/**
    * Alexander Baldree
    * 2/3/26
    * Module 5.2 Assignment
    * CSD402
    * This program locates the largest and smallest elements in both
    * double and int two-dimensional arrays and returns their positions.
    */


import java.util.Random;

public class Baldree_Mod5_CSD402 {

    // Main method
    public static void main(String[] args) {
        Random rand = new Random();

        // Makes a 3x3 double array with random numbers 10.0 - 100.0
        double[][] doubleArray = new double[3][3];
        for (double[] row : doubleArray) {
            for (int j = 0; j < row.length; j++) {
                row[j] = Math.round((10 + rand.nextDouble() * 90) * 10) / 10.0; // 10.0-100.0
            }
        }

        // Makes a 3x3 int array with random numbers 10 - 100
        int[][] intArray = new int[3][3];
        for (int[] row : intArray) {
            for (int j = 0; j < row.length; j++) {
                row[j] = 10 + rand.nextInt(91); // 10-100
            }
        }

        // Locate largest and smallest elements
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        // Print arrays
        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("\nInt Array:");
        printArray(intArray);

        // Print results
        System.out.println("\nDouble Array Results:");
        System.out.println("Largest element at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest element at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");

        System.out.println("\nInt Array Results:");
        System.out.println("Largest element at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest element at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }

    // Print double arrays
    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Print int arrays
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Locates largest in double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locates largest in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locates smallest in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locates smallest in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
