package com.LabTask10Generics;

class Gen<T> {
    T generalObject;

    Gen(T generalObject) {
        this.generalObject = generalObject;
    }

    public T getObj() {
        return generalObject;
    }

    public void showType() {
        System.out.println(generalObject.getClass().getName());
    }
}


public class a2 {
    public static void main(String[] args) {
        Gen<Integer> numbers = new Gen<Integer>(10);
        numbers.showType();

        Gen<String> letters = new Gen<String>("SAFI");
        letters.showType();

        Gen<Boolean> trueFalse = new Gen<Boolean>(true);
        trueFalse.showType();

    }
}
