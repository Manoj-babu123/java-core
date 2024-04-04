package com.learningcore.day1session1;

import java.util.Scanner;

public class MonthNameD1P31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number between 1 and 12: ");
            if (scanner.hasNextInt()) {
                int monthNumber = scanner.nextInt();
                if (monthNumber >= 1 && monthNumber <= 12) {
                    String monthName = getMonthName(monthNumber);
                    System.out.println(monthName);
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");
                scanner.next(); // clear the input buffer
            }
        }
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";

}
    }
}
