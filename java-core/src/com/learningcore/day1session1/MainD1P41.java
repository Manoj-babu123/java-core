package com.learningcore.day1session1;

import java.util.Scanner;

public class MainD1P41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two numbers from the user
        System.out.print("Enter the first number (1-40): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (1-40): ");
        int num2 = scanner.nextInt();

        // Validate the input
        if (!(1 <= num1 && num1 <= 40) || !(1 <= num2 && num2 <= 40)) {
            System.out.println("Please enter numbers between 1 and 40.");
            return;
        }

        // Single dimension array of five integer elements ranging from 1 to 40
        int[] arr = {2, 5, 12, 25, 40};

        // Compare the inputted values against the array elements
        boolean foundNum1 = false;
        boolean foundNum2 = false;
        for (int i : arr) {
            if (i == num1) {
                foundNum1 = true;
            }
            if (i == num2) {
                foundNum2 = true;
            }
        }

        // Print the result
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Numbers not found in the array");
        }
    }
}
