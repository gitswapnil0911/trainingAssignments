package com.jpm.reflection;

import com.jpm.collectionrevision.Name;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void printClassInfo(Object obj){
        Class cls = obj.getClass();
        System.out.println("Class name" +cls);
        Method methods[] = cls.getDeclaredMethods();
        for(Method m: methods) {
            System.out.println(m.getName());
        }
        System.out.println("----------------------------------------------");
        Field fields[] = cls.getDeclaredFields();
        for(Field f: fields){
            System.out.println(f.getName());
        }
    }

    public static void main(String[] args) {
        //printClassInfo("Welcome");
        //printClassInfo(100);
        printClassInfo(new Name());
    }
}
