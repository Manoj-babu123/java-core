package com.learningcore.day1session1;

import java.util.Scanner;

public class GradeCheckerD1P33{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained (out of 100): ");
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                double percentage = (double) marks / 100 * 100;
                String grade = calculateGrade(percentage);
                System.out.println("Percentage: " + percentage + "%");
                System.out.println("Grade: " + grade);
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        } else {
            System.out.println("Invalid input. Marks should be an integer.");
        }
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 60) {
            return "Grade A";
        } else if (percentage >= 45) {
            return "Grade B";
        } else if (percentage >= 35) {
            return "Grade C";
        } else {
            return "Fail";
        }
    }
}
