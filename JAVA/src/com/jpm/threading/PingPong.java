package com.jpm.threading;

public class PingPong extends Thread {
    String word;
    public PingPong(String word) {
        super(word);
        this.word=word;
    }

    public void run(){//Puts in running
        /*while (true){
            System.out.println(word);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        /*if(Thread.currentThread().getName().equals("Ping"))
            pingFunc();
        else
            pongFunc();*/
        for (int i=0;i<=10000;i++){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new PingPong("Ping");//Thread is born Example when it was extending Thread
        Thread t2 = new PingPong("Pong");
        Thread t3 = new PingPong("Ding");//Thread is born Example when it was extending Thread
        Thread t4 = new PingPong("Dong");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t2.setPriority(Thread.NORM_PRIORITY+2);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        /*
        By Implementing Rubnnable
        Runnable r1= new PingPong("Ping");//Creat Runnable object
        Runnable r2= new PingPong("Pong");
        Thread t1 = new Thread(r1);//Attach thread to object
        Thread t2 = new Thread(r2);
        t1.setName("t1");
        t2.setName("t2");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        *///t1.start();//Ready or Runnable State
        //t2.start();
    }

    public void pingFunc(){
        for (int i=0;i<=10000;i++){
        System.out.println(i+"In Ping");
    }
    }
    public void pongFunc(){
        for (int i=0;i<=10000;i++){
            System.out.println(i+"In Pong");
        }
    }

}

