package com.LABDATA.Lab12GUI;

import javax.swing.*;
import java.awt.*;


public class a1 extends JFrame {
    public a1() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        a1 frame = new a1();
        frame.setTitle("Show FlowLayout");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}