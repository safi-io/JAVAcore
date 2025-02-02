package com.recursionKunal;

public class Five_Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(12345, 0));
    }


    private static int reverse(int n, int answer) {
        if (n == 0) {
            return answer;
        }
        return reverse(n / 10, answer * 10 + n % 10);
    }
}
