package com.jpm.XYZ;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WriteEmployee{

    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        Employee emp1 = new Employee(301, "Karan", 4000);
        System.out.println("Object before Entering in file: "+emp1);
        int  id, basic;
        String name,str="";
        byte[] arr = new byte[80];
        byte[] arr1 = new byte[80];
        StringBuilder sb = new StringBuilder();

        try {
            FileOutputStream fos1 = new FileOutputStream("Emp.txt");
            id =  emp1.getEmpNo();
            name =  emp1.getEmpName();
            basic =  emp1.getEmpBasic();
            str = id + " : " + name + " : "+ basic;
            arr = str.getBytes();
            fos1.write(arr);
            fos1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis1 = new FileInputStream("Emp.txt");
            System.out.println("Reading by byte method...");
            fis1.read(arr1);
            String s = new String(arr1);
            System.out.println("File Output: "+ s);
            System.out.println("Reading by char method...");
            int i;
            char ch;
            FileInputStream fis2 = new FileInputStream("Emp.txt");
            i=fis2.read();
            while(i!=-1)
            {
               ch= (char)i;
               sb.append(ch);
               i=fis2.read();
            }
            fis1.close();
            fis2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = new String(sb);
        System.out.println("File Output: "+ s);

        System.out.println("Read employee details & recreate the employee object!!!");
        String[] empDetails = s.split(" : ");
        Employee emp2 = new Employee();
        emp2.setEmpNo(Integer.parseInt(empDetails[0]+1));
        emp2.setEmpName(empDetails[1]);
        emp2.setEmpBasic(Integer.parseInt(empDetails[2]));
        System.out.println("Recreated the employee object from file: "+emp2);
    }
}
