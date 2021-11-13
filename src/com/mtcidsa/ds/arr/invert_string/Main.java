package com.ds.arr.invert_string;

import java.util.ArrayList;
import java.util.List;

/**
 * Methods to reverse a string
 */
public class Main {
    public static void main(String[] args) {
        String toReverse = "Martin hi!";
        reverse(toReverse);
        reverse2(toReverse);
        reverse3(toReverse);

    }

    /**
     * Basic reverse
     * @param toReverse
     */
    private static void reverse(String toReverse) {
        char[] srtCharArr = toReverse.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = srtCharArr.length - 1 ; i >= 0 ; i--){
            sb.append(srtCharArr[i]);
        }
        System.out.println(sb);
    }

    /**
     * with validation and list
     * @param toReverse
     */
    private static void reverse2(String toReverse) {
        if (toReverse.isBlank() || toReverse.length() < 2) {
            System.out.println(toReverse);
            return;
        }
        char[] srtCharArr = toReverse.toCharArray();
        List<String> revList = new ArrayList<>();

        for (int i = srtCharArr.length - 1; i >= 0; i--) {
            revList.add(String.valueOf(srtCharArr[i]));
        }
        revList.forEach(System.out::print);
        System.out.println();
    }


    private static void reverse3(String toReverse) {
        System.out.println(new StringBuilder(toReverse).reverse());
    }

}
