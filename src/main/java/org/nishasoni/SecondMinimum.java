package org.nishasoni;

import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the second minimum number
        int secondMin = findSecondMin(arr);

        // Display the result
        System.out.println("The second minimum number is: " + secondMin);

        scanner.close();
    }

    // Function to find the second minimum number in an array
    public static int findSecondMin(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Error condition
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("All elements are the same in the array.");
            return -1; // Error condition
        }

        return secondMin;
    }
}
