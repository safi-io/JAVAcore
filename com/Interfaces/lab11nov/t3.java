package com.Interfaces.lab11nov;

interface compare {
    boolean compareObjects(InventoryItem o);
}

class InventoryItem implements compare {
    private String name;
    private int uniqueItemID;

    public InventoryItem(String name, int uniqueItemID) {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueItemID() {
        return uniqueItemID;
    }

    public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }

    @Override
    public boolean compareObjects(InventoryItem o) {
        return this.uniqueItemID == o.uniqueItemID;
    }

}

public class t3 {
    public static void main(String[] args) {
        InventoryItem i1 = new InventoryItem("safi", 1);
        InventoryItem i2 = new InventoryItem("ahmed", 1);
        InventoryItem i3 = new InventoryItem("ali", 2);

        System.out.println(i3.compareObjects(i2));

    }
}
