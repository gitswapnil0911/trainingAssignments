package com.jpm.collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        Student s= new Student();
        s.setNames("SSS"); //working
        s.setNames("abc");
        s.setNames("efg");
        s.setNames("hij");
        s.setNames("klm");
        s.setNames("nop");
        //s.printNames(); //Working
        //s.searchName(1);
        s.searchName("efg");
        //s.removeName("abc"); //Working
        s.printNames();
    }
}
