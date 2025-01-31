package com.LABDATA.Lab12GUI;

import javax.swing.*;
import java.awt.*;

public class a2 extends JFrame {
    public a2() {
        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        a2 frame = new a2();
        frame.setTitle("Show GridLayout");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}