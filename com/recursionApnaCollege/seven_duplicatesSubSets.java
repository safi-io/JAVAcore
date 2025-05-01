package com.recursionApnaCollege;

import java.util.ArrayList;
import java.util.HashSet;

public class seven_duplicatesSubSets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        HashSet<ArrayList<Integer>> toRemoveDups = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        printSubsetsDUP(arr, result, 0, toRemoveDups);
    }

    private static void printSubsetsDUP(int[] arr, ArrayList<Integer> result, int i, HashSet<ArrayList<Integer>> toRemoveDups) {
        if (i == arr.length) {

            if(!toRemoveDups.contains(result)) {
                System.out.println(result);
            }
            toRemoveDups.add(new ArrayList<>(result));
            return;
        }

        // Inclusion Case
        result.add(arr[i]);
        printSubsetsDUP(arr, result, i + 1, toRemoveDups);

        // BackTracking
        result.removeLast();

        // Exclusion Case
        printSubsetsDUP(arr, result, i + 1, toRemoveDups);
    }
}
