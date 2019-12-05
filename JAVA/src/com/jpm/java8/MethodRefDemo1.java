package com.jpm.java8;

interface Inf{
    public void display(String str);

}

class MyClass{
    /*public void m1(){
        System.out.println("In Method M1");
    }*/

    public void m1(String str){
        System.out.println("In Method M1"+str);
    }

}

public class MethodRefDemo1 {
    public static void main(String[] args) {
        MyClass mc=new MyClass();
        /*Inf i1=new Inf() {
            @Override
            public void display() {

                mc.m1();
            }
        };
        i1.display();
        Inf i2=mc::m1;
        i2.display();
        */
        Inf i3=mc::m1;
        i3.display("Hello 2");
    }
}
