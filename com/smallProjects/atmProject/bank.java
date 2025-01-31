package com.smallProjects.atmProject;

import java.text.SimpleDateFormat;
import java.util.*;

class atm {
    protected int pin;
    protected double balance;

    public void showMenu() {
        int choice;
        do {
        System.out.println("---Welcome to ATM Portal---");
        System.out.println("1. Set Pin.");
        System.out.println("2. See Balance.");
        System.out.println("3. Withdraw Balance.");
        System.out.println("4. Deposit Balance.");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        // Directing User to Required Option
        switch (choice) {
            case 1 :
                setPin();
                break;
            case 2 :
                if(this.pin != 0) {
                    showBalance();
                }else {
                    System.out.println("First Set your PIN!");
                    setPin();
                }
                break;
            case 3 :
                if(this.pin != 0) {
                    withdrawBalance();
                }else {
                    System.out.println("First Set your PIN!");
                    setPin();
                }
                break;
            case 4 :
                if(this.pin != 0) {
                    depositBalance();
                }else {
                    System.out.println("First Set your PIN!");
                    setPin();
                }
                break;
            case 5 :
                return;
        }
        }while(choice != 5);
    }
    public void setPin() {
        System.out.println("Enter your 4-digit pin.");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        // To find length
        int tempCount = 0;
        int tempPin = pin;
        while(pin > 0) {
            tempCount++;
            pin /=10;
        }
        // Verifying the length
        if(tempCount == 4) {
            System.out.println("Your Pin is initialized.");
            this.pin = tempPin;
        }else {
            setPin();
        }
        showMenu();

    }
    public void showBalance() {
        Date d1 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss");

        System.out.println("Your balance on " +formatter.format(d1) + " is: \n" + balance +"$");
        showMenu();
    }
    public void depositBalance(){
        System.out.println("Enter Amount to Deposit.");
        Scanner sc = new Scanner(System.in);
        this.balance += sc.nextDouble();
        System.out.println("Your Amount has been successfully Added.");
        showMenu();
    }
    public void withdrawBalance() {
        System.out.println("Enter Amount to Withdraw.");
        Scanner sc = new Scanner(System.in);
        double withDrawAmount = sc.nextDouble();
        if(!(withDrawAmount > this.balance)) {
            this.balance -= withDrawAmount;
        }else {
            System.out.println("Balance is less than WithDraw Amount.");
            withdrawBalance();
        }
        System.out.println("Amount is withDrawn.");
        showMenu();
    }
}