package com.ds.arr.merge_arr;

import java.util.*;

/**
 * merge Sorted Array [0,3,4,31] [4,6,30] = [0,3,4,4,6,30,31]
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {4, 6, 30};

        sort1(arr1, arr2);
        System.out.println();
        sort2(arr1, arr2);

    }

    //buble sort [0,3,4,4,6,30,31]
    private static void sort1(int[] arr1, int[] arr2) {
        int[] merge = mergeArr(arr1, arr2);

        Arrays.stream(merge).forEach(s -> System.out.print(s + " "));
        for (int i = 0; i < merge.length; i++) {
            for (int j = i + 1; j < merge.length; j++) {
                if (merge[j] < merge[i]) {
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        System.out.println("");
        Arrays.stream(merge).forEach(s -> System.out.print(s + " "));
    }

    //With Sort methods
    private static void sort2(int[] arr1, int[] arr2) {
        int[] arr = mergeArr(arr1, arr2);
        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(list::add);
        Collections.sort(list);
        list.forEach(s -> System.out.print(s + " "));

    }

    private static int[] mergeArr(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int[] merge = new int[arr1Length + arr2Length];
        int mergeIndex = 0;

        for (int i = 0; i < arr1Length; i++, mergeIndex++) {
            merge[mergeIndex] = arr1[i];
        }

        for (int j = 0; j < arr2Length; j++, mergeIndex++) {
            merge[mergeIndex] = arr2[j];
        }
        return merge;
    }

}
