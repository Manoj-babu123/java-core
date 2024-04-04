package com.learningcore.day1session1;

import java.util.Scanner;

public class WeekdayD1P32{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a week number (1-7): ");
            if (scanner.hasNextInt()) {
                int weekNumber = scanner.nextInt();
                String weekday = getWeekday(weekNumber);
                System.out.println(weekday);
            } else {
                System.out.println("Invalid input");
                scanner.next(); // clear the input buffer
            }
        }
    }

    public static String getWeekday(int weekNumber) {
        if (weekNumber < 1 || weekNumber > 7) {
            return "Invalid Input";
        } else {
            if (weekNumber == 1) {
                return "Monday";
            } else if (weekNumber == 2) {
                return "Tuesday";
            } else if (weekNumber == 3) {
                return "Wednesday";
            } else if (weekNumber == 4) {
                return "Thursday";
            } else if (weekNumber == 5) {
                return "Friday";
            } else if (weekNumber == 6) {
                return "Saturday";
            } else {
                return "Sunday";
            }
        }
    }
}
