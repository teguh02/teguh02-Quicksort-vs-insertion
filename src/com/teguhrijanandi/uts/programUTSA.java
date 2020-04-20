/**
 * This code writed by Teguh Rijanandi
 * => Quick sort data, running time test
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

public class programUTSA
{
    /**
     * Process to quick sorting data
     */

    public static int magic(int X[], int a, int b)
    {
        int pivot = X[b];
        int i = (a-1);
        for (int j=a; j<b; j++)
        {

            if (X[j] < pivot)
            {
                i++;
                int t = X[i];
                X[i] = X[j];
                X[j] = t;
            }
        }
        int t = X[i+1];
        X[i+1] = X[b];
        X[b] = t;

        return i+1;
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
        int acak = rand.nextInt(n);

        // Return data
        return acak;
    }

    /**
     * Process to quick sorting data
     */

    public static void algoritma_A (int X[], int a, int b)
    {
        if (a < b)
        {
            int pi = magic(X, a, b);
            algoritma_A (X, a, pi-1);
            algoritma_A (X, pi+1, b);
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
        int ukuran = scan.nextInt();

        // Store data into array
        int[] dataArr = new int[ukuran];
        for (int i = 0; i < ukuran ; i++) {
            dataArr[i] = generateRandArr(ukuran);
        }

        // It's time to sorting data using quick sort
        algoritma_A(dataArr, 0, dataArr.length - 1);

        // Finnaly print data as matrix
        printArray(dataArr);

        // Print 2 new line as enter
        System.out.println();
        System.out.println();

        // Print runtime times
        System.out.println(getrunTime());

    }
}