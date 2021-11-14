package com.mtcidsa.ds.hasht.implementation;

public class Main {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(10);
        myHashTable.set("grapes", "100");
        System.out.println(myHashTable.get("grapes"));
        System.out.println(myHashTable.get("fruta"));

    }
}
