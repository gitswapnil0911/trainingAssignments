package com.jpm.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachJ8Demo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("aaa","bbb","cccc","ddddd");
        System.out.println(list);
        for (String e:list) {         //FOr each JAVA 8 prior
            System.out.println(e);
        }
    list.forEach(new Consumer<String>() {
        @Override
        public void accept(String s) {    //JAVA 8 for each
            System.out.println(s);
        }
    });
        //Integer For each example
        List<Integer> list1=Arrays.asList(10,20,30,40,50);
        list1.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        List<String> list2=Arrays.asList("Sam","pat","Sandy");
        list2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
                System.out.println(s.length());
                System.out.println(s.toUpperCase());
            }
        });

        List<String> list3=Arrays.asList("Sam1","pat2","Sandy3");
        list3.forEach(arg -> System.out.println(arg)); //For each loop using Lambda

    }
}
