package Expt9;

import java.util.Scanner;

public class Smallestmissingelement {

        static int findSmallestMissing(int[] arr) {
        int n = arr.length;
        int expected = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != expected) {
                return expected;
            }
            expected++;
        }

        return expected;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();  // Number of test cases

        for (int test = 1; test <= t; test++) {
            System.out.println("\nTest case " + test + ":");

            System.out.print("Enter size of array: ");
            int n = sc.nextInt(); // size of array

            int[] arr = new int[n];
            System.out.println("Enter " + n + " sorted non-negative distinct integers:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int missing = findSmallestMissing(arr);
            System.out.println("Smallest missing element: " + missing);
        }

        sc.close();
    }
}
