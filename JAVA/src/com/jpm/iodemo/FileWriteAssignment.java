package com.jpm.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileWriteAssignment {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\5FileOutput.txt",false);
        String s = "";
        byte arr[] = new byte[80];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            s += sc.nextLine()+"\n";;
            //s+="\n";
            arr = s.getBytes(); //Convert string to Bytes
            fos.write(arr);
        }
        fos.close();
        Arrays.fill(arr,(byte)0);
        FileInputStream fis = new FileInputStream("D:\\5FileOutput.txt");
        fis.read(arr);
        System.out.println(arr.length);
        String s1 = new String(arr);
        System.out.println(s1);
    }

}
