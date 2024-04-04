package com.learningcore.day1session1;

import java.util.*;

public class MainD1P43 {
    public static void main(String[] args) {
        int[] arr = {7,10,5,3,4,3,5,6};
        int index = findFirstRepeating(arr);
        if (index != -1) {
            System.out.println("First repeating element found at index: " + index);
        } else {
            System.out.println("No repeating element found.");
        }
    }

    static int findFirstRepeating(int[] arr) {
        // Use a map to store the index of each element
        Map<Integer, Integer> indexMap = new HashMap<>();

        // Traverse the array and find the first repeating element
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, indexMap.get(arr[i]));
            } else {
                indexMap.put(arr[i], i);
            }
        }

        // Return the index of the first repeating element
        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }
}
