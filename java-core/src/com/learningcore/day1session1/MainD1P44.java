package com.learningcore.day1session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainD1P44 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        List<List<Integer>> combinations = findCombinations(arr, k);
        System.out.println("Distinct combinations of " + k + " numbers:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    static List<List<Integer>> findCombinations(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        findCombinationsUtil(arr, k, 0, new ArrayList<>(), result);
        return result;
    }

    static void findCombinationsUtil(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }
            current.add(arr[i]);
            findCombinationsUtil(arr, k - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
