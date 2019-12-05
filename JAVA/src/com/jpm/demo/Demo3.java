package com.jpm.demo;

interface AddIntf{
    public  int add(int a, int b);
    public String add(String a, String b);
}

public class Demo3 {
    public static void main(String[] args) {
        AddIntf a1=new AddIntf() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public String add(String a, String b) {
                return a+b;
            }
        };
        System.out.println(a1.add(2,3));
        System.out.println(a1.add("Hey","Done"));
    }
}
