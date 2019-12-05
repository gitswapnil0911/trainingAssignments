package com.jpm;

class MyClass extends Thread {
    public MyClass(String s) { msg = s; }
    String msg;
    public void run() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        new MyClass("Hello");
        new MyClass("World");
    }
}