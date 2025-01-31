package com.LABDATA.LabTask10Generics;

class multipleGen<V, T> {
    V object1;
    T object2;

    multipleGen(V object1, T object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void showTypes() {
        System.out.println("Type of V is " + object1.getClass().getName());
        System.out.println("Type of T is " + object2.getClass().getName());
        System.out.println();
    }
}

public class a3 {
    public static void main(String[] args) {
        multipleGen<Integer, Boolean> pair1 = new multipleGen<>(101, true);
        multipleGen<String, Character> pair2 = new multipleGen<>("Safi", 'M');

        pair1.showTypes();
        pair2.showTypes();
    }
}
