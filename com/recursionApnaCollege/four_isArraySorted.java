package com.recursionApnaCollege;

public class four_isArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(isArraySorted(arr, 0));
    }

    private static boolean isArraySorted(int[] arr, int index) {
        if (arr.length - 1 == index) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isArraySorted(arr, index + 1);
    }
}
