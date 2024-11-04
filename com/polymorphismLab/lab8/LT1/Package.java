package com.polymorphismLab.lab8.LT1;

class Package {
    protected String senderName;
    protected String senderAddress;

    protected String receiverName;
    protected String receiverAddress;

    protected double ouncesWeight;
    protected double pricePerOunce;

    public Package(String senderName, String senderAddress, String receiverName, String receiverAddress, double ouncesWeight, double pricePerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        if(ouncesWeight < 0 || pricePerOunce < 0) {
            System.out.println("Weight and Price must be greater than Zero.");
            return;
        }
        this.ouncesWeight = ouncesWeight;
        this.pricePerOunce = pricePerOunce;
    }

    public double calculateCost() {
        double price;
        price = ouncesWeight * pricePerOunce;
        return price;
    }
}
