package com.ds.arr.implementation;

import java.util.ArrayList;
import java.util.List;

//Own implementation of array
public class MyArray {
    int length;
    List<String> data = new ArrayList<>();

    public MyArray() {
    }

    String get(int index) {
        return this.data.get(index);
    }

    int push(String item) {
        this.data.add(this.length, item);
        this.length++;
        return this.length;
    }

    void pop() {
        int lastItemIndex = this.length - 1;
        this.data.remove(lastItemIndex);
        this.length--;

    }

    void delete(int index) {
        this.data.remove(index);
        this.length--;
    }


}
