package com.mtcidsa.ds.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
        //10-->5-->16
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(10);
        myLinkedList.append(5);
        myLinkedList.append(16);
        System.out.println(myLinkedList);
    }
}
