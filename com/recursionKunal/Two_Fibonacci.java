package com.recursionKunal;

public class Two_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }

    private static int fibo(int n) {
        if(n<2) return n;

        // Recurrence Relation
        return fibo(n - 1) + fibo(n - 2);
    }
}
