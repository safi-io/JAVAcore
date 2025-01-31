package com.LABDATA.Lab12GUI;

import javax.swing.*;
import java.awt.*;

public class a3 extends JFrame {
    public a3() {

        setLayout(new BorderLayout(5, 10));
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("WEST"), BorderLayout.WEST);
        add(new JButton("NORTH"), BorderLayout.NORTH);
        add(new JButton("CENTER"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        a3 frame = new a3();
        frame.setTitle("Show BorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}