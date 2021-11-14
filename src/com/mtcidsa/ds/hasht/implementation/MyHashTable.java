package com.mtcidsa.ds.hasht.implementation;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {
    private int size;
    private List<String> data;
    private static final String format = "[%s - %s]";

    public MyHashTable(int size) {
        this.size = size;
        this.data = new ArrayList<>(size);
    }

    String _hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + (key.charAt(i) * i)) % this.size;
        }
        return String.valueOf(hash);
    }

    String get(String key) {
        String hashedKey = _hash(key);
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).equals(hashedKey)) {
                return String.format(format, this.data.get(i + 1), this.data.get(i + 2));
            }
        }
        return String.format(format, "", "");
    }

    void set(String key, String value) {
        if (this.size > 0) {
            String hashedKey = _hash(key);
            this.data.add(hashedKey);
            this.data.add(key);
            this.data.add(value);
            this.size--;
        } else {
            System.out.println("no more space");
        }
    }


}
