package com.recursionApnaCollege;

public class three_fibo {
    public static void main(String[] args) {
        System.out.println("The Fibo of nth term is: " + calculateFibo(4));
    }

    private static int calculateFibo(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return calculateFibo(num - 1) + calculateFibo(num - 2);
    }
}
