package com.basicsOOP.NumberGuess;
import java.util.Scanner;

public class Runner {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // used for taking input from user
        int myNumber = (int)(Math.random() * 100); // taking random number & typecasting
        int userNumber;
        boolean flag;

        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt(); // take input from the user

            if(userNumber < 0) {
                System.out.println(myNumber);
                return;
            }

            if (userNumber == myNumber) {
                System.out.println("wow! You guess right number .");
                flag = true;
                break;
            } else if (userNumber > myNumber) {
                System.out.println("You guess a high number ");
            } else {
                System.out.println("You guess a small number ");
            }
        } while (true);

        if(flag) {
            System.out.println("You Guessed it right.");
        }else {
            System.out.println("oops! you lose better luck next time ");
            System.out.println("My number was : " + myNumber);
        }

        sc.close();
    }
}