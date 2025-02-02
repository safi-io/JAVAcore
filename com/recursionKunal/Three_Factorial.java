package com.recursionKunal;

public class Three_Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int number) {
        if (number == 1) return 1;

        return number * fact(number - 1);
    }
}
