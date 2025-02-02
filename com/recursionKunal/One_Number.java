package com.recursionKunal;

public class One_Number {
    public static void main(String[] args) {
        numberPrint(10);
        System.out.println();
        numberPrintRev(10);
    }

    private static void numberPrint(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        numberPrint(n - 1);
    }

    private static void numberPrintRev(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        numberPrint(n - 1);
        System.out.print(n + " ");
    }
}
