package com.recursionApnaCollege;
import java.util.ArrayList;

// Time Complexity
//              O(n * 2^n)

public class six_subsetsUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> result = new ArrayList<>();
        printSubsets(arr, result, 0);
    }

    private static void printSubsets(int[] arr, ArrayList<Integer> result, int i) {
        if (i == arr.length) {
            System.out.println(result);
            return;
        }

        // Inclusion Case
        result.add(arr[i]);
        printSubsets(arr, result, i + 1);

        // BackTracking
        result.removeLast();

        // Exclusion Case
        printSubsets(arr, result, i + 1);
    }

}
