package com.LABDATA.Lab12GUI;

import javax.swing.*;
import java.awt.*;

public class t1 {
    public t1() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel displayPanel = new JPanel(new BorderLayout());

        JTextField displayLabel = new JTextField();
        displayLabel.setFont(new Font("", Font.BOLD, 22));

        displayPanel.add(displayLabel, BorderLayout.CENTER);

        frame.add(displayPanel, BorderLayout.NORTH);

        // Buttons to be Added
        JPanel buttonPanel = new JPanel(new GridLayout(4,3));
        JButton b1 = new JButton("92");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("7");
        JButton b4 = new JButton("6");

        JButton b5 = new JButton("5");
        JButton b6 = new JButton("4");
        JButton b7 = new JButton("3");
        JButton b8 = new JButton("2");

        JButton b9 = new JButton("1");
        JButton b10 = new JButton("+");
        JButton b11 = new JButton("-");
        JButton b12 = new JButton("*");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(b10);
        buttonPanel.add(b11);
        buttonPanel.add(b12);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new t1();
    }
}
