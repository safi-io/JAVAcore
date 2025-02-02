package com.recursionKunal;

public class Four_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(884));
    }

    private static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }
}
