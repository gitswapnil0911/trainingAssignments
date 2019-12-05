package com.jpm.demo;

interface GreetIntf {

    public void greet();
}


public class Demo{
    public static void main(String[] args) {
        GreetIntf i1=new GreetIntf() {
            @Override
            public void greet() {
                System.out.println("Welcome");
            }
        };
        GreetIntf i2= () -> System.out.println("Hello Lambda");

        //i1.greet();
        i2.greet();
    }

}