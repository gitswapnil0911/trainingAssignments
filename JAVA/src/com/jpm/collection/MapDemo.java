package com.jpm.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(1,"One");
        System.out.println(map);
        System.out.println(map.get(1));

        Set<Integer> set =map.keySet();
        for (Integer i:set) {
            System.out.println(i+" : "+map.get(i));

        }
    }
}
