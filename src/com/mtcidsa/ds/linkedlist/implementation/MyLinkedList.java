package com.mtcidsa.ds.linkedlist.implementation;

import java.util.Objects;

public class MyLinkedList {
    //head
    private Node head;

    //linked list node
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    void append(int val) {
        Node newNode = new Node(val);
        if (Objects.isNull(this.head)) {
            //Add the first element as head
            this.head = newNode;
        } else {
            //Initial last node as head
            Node last = this.head;
            //search the last node that is not null
            while (last.next != null) {
                //we are updating the pointer of last to the next element until is null
                last = last.next;
            }
            //when is null, that is because is the tail, update the next to the new value added
            last.next = newNode;
        }
    }
}

