package com.jpm.iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IoDemo {
    public static void main(String[] args) {
        byte arr[]=new byte[80];
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        arr=s1.getBytes();

        try {
            OutputStream out= new FileOutputStream("d:\\newfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
