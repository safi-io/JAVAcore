package com.LabTask10Generics;

import java.util.ArrayList;

public class a1 {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<String>();
        objects.add("HONDA");
        objects.add("SUZUKI");
        System.out.println("Size: " + objects.size());
        System.out.println(objects);
        objects.remove(1);
        System.out.println("Size: " + objects.size());
        System.out.println(objects);
    }
}
