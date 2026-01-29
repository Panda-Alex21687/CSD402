public class Baldree_Mod4_2_CSD402 {

    public static void main(String[] args) {

        /**
         * Name: Alex Baldree
         * Course: CSD402
         * Module: 4.2 Assignment
         * Assignment: Overloaded Average Methods
         *
         * This program demonstrates method overloading by calculating
         * the average of arrays of different numeric data types.
         */

        // Create arrays of different sizes
        short[] shortArray = {5, 10, 15};
        int[] intArray = {20, 30, 40, 50};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display arrays and their averages
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        displayArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        displayArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // ----- Overloaded Average Methods -----

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // ----- Display Methods -----

    public static void displayArray(short[] array) {
        System.out.print("Short array: ");
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(int[] array) {
        System.out.print("Int array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(long[] array) {
        System.out.print("Long array: ");
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array) {
        System.out.print("Double array: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
