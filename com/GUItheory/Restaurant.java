package com.GUItheory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Restaurant {
    static JFrame frame;
    static double totalCost;
    static JComboBox<String> itemComboBox;
    static JTextField quantityField;

    public Restaurant() {
        setupFrame();
        setupNorthPanel();
        setupCenterPanel();
        setupSouthPanel();
        frame.setVisible(true);
    }

    private static void setupSouthPanel() {
        JPanel southPanel = new JPanel();
        JButton calculateCostButton = new JButton("Calculate Total");
        southPanel.add(calculateCostButton);

        JLabel costLabel = new JLabel("Total: 0 Rs.");
        costLabel.setFont(new Font("", Font.BOLD, 18));
        southPanel.add(costLabel);

        calculateCostButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int quantity = Integer.parseInt(quantityField.getText());
                    if (quantity < 0) {
                        throw new NumberFormatException("Negative quantity is invalid.");
                    }

                    String selectedItem = (String) itemComboBox.getSelectedItem();
                    int itemPrice = 0;
                    if (selectedItem.contains("Pizza - 1000 Rs.")) {
                        itemPrice = 1000;
                    } else if (selectedItem.contains("Burger - 200 Rs.")) {
                        itemPrice = 200;
                    } else {
                        itemPrice = 500;
                    }

                    double itemTotal = quantity * itemPrice;
                    totalCost += itemTotal;
                    costLabel.setText("Total: " + totalCost + " Rs.");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter a valid quantity!",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(southPanel, BorderLayout.SOUTH);
    }

    private static void setupCenterPanel() {
        JPanel centerPanel = new JPanel(new GridLayout(2, 2));

        JLabel selectLabel = new JLabel("Select Item:");
        selectLabel.setFont(new Font("", Font.BOLD, 26));

        itemComboBox = new JComboBox<>(new String[]{"Pizza - 1000 Rs.", "Burger - 200 Rs.", "Fries - 500 Rs."});

        JLabel enterQuantityLabel = new JLabel("Enter Quantity:");
        enterQuantityLabel.setFont(new Font("", Font.BOLD, 26));

        quantityField = new JTextField();

        centerPanel.add(selectLabel);
        centerPanel.add(itemComboBox);
        centerPanel.add(enterQuantityLabel);
        centerPanel.add(quantityField);

        frame.add(centerPanel, BorderLayout.CENTER);
    }

    private static void setupNorthPanel() {
        JPanel titlePanel = new JPanel(new GridBagLayout());
        JLabel title = new JLabel("Restaurant Order System");
        title.setFont(new Font("", Font.BOLD, 28));
        titlePanel.add(title);
        frame.add(titlePanel, BorderLayout.NORTH);
    }

    private static void setupFrame() {
        frame = new JFrame("Restaurant Management System");
        frame.setSize(900, 700);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}
