package com.ds.arr.implementation;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        System.out.println(myArray.length + "-" + myArray.data);
        System.out.println(myArray.push("hi"));
        System.out.println(myArray.push("you"));

        System.out.println(myArray.length + "-" + myArray.data);
        System.out.println(myArray.push("!"));
        System.out.println(myArray.length + "-" + myArray.data);
        myArray.pop();
        System.out.println(myArray.length + "-" + myArray.data);
        myArray.delete(0);
        System.out.println(myArray.length + "-" + myArray.data);
    }
}
