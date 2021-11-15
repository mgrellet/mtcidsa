package com.mtcidsa.ds.hasht.first_recurrent_char;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Return the first recurrent character
 * <p>
 * Given [2,5,1,2,3,5,1,2,4]
 * it should return 2
 * <p>
 * Given [2,1,1,2,3,5,1,2,4]
 * it should return 1
 * <p>
 * Given [2,3,4,5]
 * it should return 0
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 5, 1, 2, 3, 5, 1, 2, 4);
        List<Integer> list2 = Arrays.asList(2, 1, 1, 2, 3, 5, 1, 2, 4);
        List<Integer> list3 = Arrays.asList(2, 3, 4, 5);

        int sol1 = getFirstRecurrentChar(list1);
        int sol2 = getFirstRecurrentChar(list2);
        int sol3 = getFirstRecurrentChar(list3);
        System.out.println("should return 2 and returns: " + sol1);
        System.out.println("should return 1 and returns: " + sol2);
        System.out.println("should return 0 and returns: " + sol3);


    }

    private static Integer getFirstRecurrentChar(List<Integer> list) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (Integer l : list) {
            if (myMap.containsKey(l)) {
                return myMap.get(l);
            } else {
                myMap.put(l, l);
            }
        }
        return 0;
    }//O(n)
}
