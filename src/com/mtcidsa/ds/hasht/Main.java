package com.mtcidsa.ds.hasht;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("age", "36"); //O(1)
        System.out.println(map.get("age"));//O(1)
        map.put("to_delete", "delete");
        map.remove("to_delete");///O(1)

    }
}
