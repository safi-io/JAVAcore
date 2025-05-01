package com.recursionApnaCollege;

public class five_binarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println(binarySearch(arr, 30, 0, arr.length - 1));
    }

    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return false;
        int mid = (start + end) / 2;
        if (arr[mid] == target) return true;

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, mid - 1);
    }
}
