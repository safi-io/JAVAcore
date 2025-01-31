package com.LABDATA.lab8.LT2;

class Professor extends Person {
    private int numberOfPublications;

    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public boolean isOutstanding() {
        if (numberOfPublications >= 50) {
            return true;
        }
        return false;
    }
}
