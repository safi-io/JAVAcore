package com.safikhan.accessModifiers.test;

import com.safikhan.accessModifiers.school.School;

public class Test {
    public static void main(String[] args) {
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
    }
}
