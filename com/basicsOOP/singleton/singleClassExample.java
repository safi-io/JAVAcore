package com.basicsOOP.singleton;

class singleClassExample {

    private static singleClassExample instance;

    private singleClassExample() {}

    public static singleClassExample getInstance() {
        if(instance == null) {
            instance = new singleClassExample();
        }
        return instance;
    }

}
