/**
 * This code writed by Teguh Rijanandi
 * => Insertion sort data, running time test
 *
 * S1SE03B - 19104008
 * Institut Teknologi Telkom Purwokerto
 */

package com.teguhrijanandi.uts;

// import class Decimal Format
import java.text.DecimalFormat;

// import class Number Format
import java.text.NumberFormat;

// import class random
import java.util.Random;

// import class scanner
import java.util.Scanner;

public class programUTSB {

    /**
     * @param X
     * Method to sorting data using insertion sort
     */

    public static void algoritma_C(int X[])
    {
        int n = X.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (X[j] > X[j+1])
                {
                    // swap temp and X[i]
                    int y = X[j];
                    X[j] = X[j+1];
                    X[j+1] = y;
                }
    }

    /**
     * Process to print array as matrix
     */

    public static void printArray(int arr[]) {
        System.out.print("|  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" |");
    }

    /**
     *
     * @param n as random length
     * @return a random integer number
     */

    public static int generateRandArr(int n) {
        // create instance of Random class
        Random rand = new Random();

        // Prosedure to Generate random integers in range 0 to input value
        int random = rand.nextInt(n);

        // Return data
        return random;
    }

    /**
     *  Method to get runtime times in miliseconds
     *  after you click the play button
     */

    public static String getrunTime() {
        long start = 0;
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        String results = "Execution time is " + formatter.format((end - start) / 1000d) + " miliseconds";
        return results;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Size of input
        System.out.print("Size of input : ");

        // scan input value
        int size = scan.nextInt();

        // Store data into array
        int[] data = new int[size];
        for (int i = 0; i < size ; i++) {
            data[i] = generateRandArr(size);
        }

        // It's time to sorting data using insertion sort
        algoritma_C(data);

        // Finnaly print data as matrix
        printArray(data);

        // Print 2 new line as enter
        System.out.println();
        System.out.println();

        // Print runtime times
        System.out.println(getrunTime());
    }
}
