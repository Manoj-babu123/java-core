package com.learningcore.day1session1;

public class IntegerD1P42 {
    public static void main(String[] args) {
        int[] A = {2,4,5,6,4,5,7,3,2,3,4,7,1,2,3,0,0,0};

        // Compute the sum of elements from index 0 to 14
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += A[i];
        }
        // Store the sum at element 15
        A[15] = sum;

        // Compute the average of all numbers
        double average = (double) sum / 18;
        // Store the average at element 16
        A[16] = (int) average;

        // Identify the smallest value from the array
        int smallest = A[0];
        for (int i = 1; i < 18; i++) {
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        // Store the smallest value at element 17
        A[17] = smallest;

        // Print the modified array
        for (int i = 0; i < 18; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}