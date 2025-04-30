package com.recursionApnaCollege;

public class two_sumOfnNums {
    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }

    private static int calculateSum(int num) {

        if (num == 1) {
            return 1;
        }

        return num + calculateSum(num - 1);
    }
}
