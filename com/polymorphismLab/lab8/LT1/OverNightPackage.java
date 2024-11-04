package com.polymorphismLab.lab8.LT1;

public class OverNightPackage extends Package {
    private double overNightFlatFee;

    public OverNightPackage(String senderName, String senderAddress, String receiverName, String receiverAddress, double ouncesWeight, double pricePerOunce, double overNightFlatFee) {
        super(senderName, senderAddress, receiverName, receiverAddress, ouncesWeight, pricePerOunce);
        this.overNightFlatFee = overNightFlatFee;
    }

    @Override
    public double calculateCost() {
        double price = super.calculateCost();
        price += overNightFlatFee;
        return price;
    }

}
