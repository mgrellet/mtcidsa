package com.ds.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Array.Push    -> ArrayList.add(Object o); // Append the list
 * Array.pop     -> ArrayList.remove(int index); // Remove list[index]
 * Array.shift   -> ArrayList.remove(0); // Remove first element
 * Array.unshift -> ArrayList.add(int index, Object o); // Prepend the list
 * */
public class Main {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        //a => 4*4 = 16 bytes of storage
        strs.add("e"); //add element
        System.out.println(strs);
        strs.remove("b");//remove element
        System.out.println(strs);
        strs.add(0, "x");//add element in a particular position
        System.out.println(strs);
        strs.remove(3); //remove element in the 3 position
        System.out.println(strs);




    }
}
