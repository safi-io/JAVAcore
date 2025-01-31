package com.LABDATA.lab8.LT1;

public class TwoDayPackage extends Package{
    private double twoDayFlatFee;

    public TwoDayPackage(String senderName, String senderAddress, String receiverName, String receiverAddress, double ouncesWeight, double pricePerOunce, double twoDayFlatFee) {
        super(senderName, senderAddress, receiverName, receiverAddress, ouncesWeight, pricePerOunce);
        this.twoDayFlatFee = twoDayFlatFee;
    }

    @Override
    public double calculateCost() {
        double price = super.calculateCost();
        price += twoDayFlatFee;
        return price;
    }
}
