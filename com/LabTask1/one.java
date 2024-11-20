package LabTask1;

import java.util.*;

class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Time() {
        hours = 7;
        minutes = 35;
        seconds  = 10;
    }

    public Time(int hours, int minutes, int seconds) {

        if( hours > 0 && hours < 24) {
            this.hours = hours;
        }else {
            System.out.println("Hours are incorrect.  Default Value Added.");
            this.hours = 7;
        }

        if(minutes > 0 && minutes < 60) {
            this.minutes = minutes;
        }else {
            System.out.println("Minutes are incorrect. Default Value Added.");
            this.minutes = 35;
        }

        if(seconds > 0 && seconds < 60) {
            this.seconds = seconds;
        }else {
            System.out.println("Seconds are incorrect. Default Value Added.");
            this.seconds = 10;
        }

    }

    public void display() {
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}

public class one {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours, minutes, seconds;
        System.out.println("Enter H,M,S with space in each.");

        hours = sc.nextInt();
        minutes = sc.nextInt();
        seconds = sc.nextInt();

        Time t1 = new Time(hours, minutes, seconds);
        t1.display();

//        Time t2 = new Time();
//        t2.display();
    }
}
