package com.smallProjects;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeAutomationSystem {
    public HomeAutomationSystem() {
        JFrame frame = new JFrame("HOME AUTOMATION");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));


        lightPanel(frame);
        fanPanel(frame);
        temperaturePanel(frame);


        frame.setVisible(true);
    }

    private void lightPanel(JFrame frame) {
        JPanel lightPanel = new JPanel(new FlowLayout());

        JLabel lightLabel = new JLabel("Lights");
        JButton onButton = new JButton("ON");
        JButton offButton = new JButton("OFF");

        onButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Light ON");
            }
        });

        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Light OFF");
            }
        });

        lightPanel.add(lightLabel);
        lightPanel.add(onButton);
        lightPanel.add(offButton);
        frame.add(lightPanel);
    }

    private void fanPanel(JFrame frame) {
        JPanel fanPanel = new JPanel(new FlowLayout());

        JLabel fanLabel = new JLabel("Fan");
        JButton onButton = new JButton("ON");
        JButton offButton = new JButton("OFF");

        onButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fan ON");
            }
        });

        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fan OFF");
            }
        });


        fanPanel.add(fanLabel);
        fanPanel.add(onButton);
        fanPanel.add(offButton);
        frame.add(fanPanel);
    }

    private void temperaturePanel(JFrame frame) {
        JPanel temperaturePanel = new JPanel(new FlowLayout());

        JLabel temperatureLabel = new JLabel("AC Temperature:");
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 16, 30, 22);

        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.setLabelTable(slider.createStandardLabels(2));

        JLabel selectLabel = new JLabel("22C");


        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                selectLabel.setText(slider.getValue() + "C");
            }
        });

        temperaturePanel.add(temperatureLabel);
        temperaturePanel.add(slider);
        temperaturePanel.add(selectLabel);

        frame.add(temperaturePanel);
    }

    public static void main(String[] args) {
        new HomeAutomationSystem();
    }
}
