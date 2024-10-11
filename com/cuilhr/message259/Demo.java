package com.cuilhr.message259;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        MsgSystem m1 = new MsgSystem();
        DefaultMessages d1 = new DefaultMessages();

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int choice;
        d1.originalMessages(m1);

        while (true) {

            System.out.print("\nEnter 1 to view the contact List :\nEnter 2 to Send Message : \nEnter 3 to view the Messages: \nEnter 4 to visiting Status based Messages: \nEnter 5 to add Contact: \nEnter 6 to delete Contact: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 0:
                    System.exit(0);
                    break;

                case 1:
                    m1.contactList();
                    break;

                case 2:
                    m1.contactList();
                    System.out.print("Enter the receiver name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the content of message: ");
                    String content = sc.nextLine();
                    m1.sendMsg(name, content, false);
                    break;

                case 3:
                    m1.receiverMessages();
                    break;
                case 4:
                    m1.statusHistory();
                    break;
                case 5:
                    m1.addContact();
                    break;
                case 6:
                    m1.deleteContact();
                    break;

                default:
                    break;
            }

        }


    }
}
