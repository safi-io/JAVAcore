package com.recursionApnaCollege;

public class one_factorial {
    public static void main(String[] args) {
        int n = 4; // 120
        System.out.println("Factorial of " + n + " is:" + calculateFactorial(n));

    }

    private static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
