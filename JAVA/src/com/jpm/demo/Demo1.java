package com.jpm.demo;

interface WelcomeIntf{
    public void message(String name);
}

interface CalcIntf{
    public int add(int a, int b);
}

public class Demo1 {
    public static void main(String[] args) {
        WelcomeIntf w1 =new WelcomeIntf() {
            @Override
            public void message(String name) {
                System.out.println("Hello"+name);
            }
        };
    w1.message(" Swapnil");
    WelcomeIntf w2= (String param) ->System.out.println("Hello"+param);
    w2.message(" Swap");
    WelcomeIntf w3=(param) -> System.out.println("Hello"+param);
    w3.message(" Sam");
    WelcomeIntf w4= param -> System.out.println("Hello"+param);
    w4.message(" SSS");

    //int a=10, b=20;
    CalcIntf c1=(x,y) -> x+y;
        System.out.println(c1.add(10,20));

        CalcIntf c2=(x,y) -> {
            int sum=0;
            sum=x+y;
            return sum;
        };
        System.out.println(c2.add(20,50));
    }
}
