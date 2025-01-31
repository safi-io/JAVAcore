package com.LABDATA.labManual;

interface Enumeration {
    boolean hasNext(int index);

    Object getNext(int index);
}

class NameCollection implements Enumeration {
    String[] names = new String[100];

    public NameCollection(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext(int index) {
        return index < names.length && names[index] != null;
    }

    @Override
    public Object getNext(int index) {
        if (hasNext(index)) {
            return names[index];
        }
        return null;
    }
}

public class t4 {
    public static void main(String[] args) {
        String[] sampleNames = {"John", "Jane", "Bob", "Alice", "Tom", "Emily"};

        NameCollection nameCollection = new NameCollection(sampleNames);

        for (int i = 0; nameCollection.hasNext(i); i++) {
            System.out.println(nameCollection.getNext(i));
        }

    }
}
