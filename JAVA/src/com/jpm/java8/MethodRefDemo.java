package com.jpm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefDemo {
    public static void m1(String s){
        System.out.println("S : "+s);
    }
    public static void main(String[] args) {
        //MethodRefDemo.m1();
        List<String> str = Arrays.asList("abc","nnn","xyz","mno");
        for (String s:str) {
            System.out.println(s);
            System.out.println("-------------------------------");
            str.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    MethodRefDemo.m1(s);
                }
            });
            System.out.println("--------------------");
            str.forEach(s1 -> MethodRefDemo.m1(s));
            System.out.println("---------------------");
            str.forEach(MethodRefDemo::m1);
            System.out.println("-----------------------");
            str.forEach(System.out::println);
        }
    }
}
