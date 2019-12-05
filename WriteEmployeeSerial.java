package com.jpm.XYZ;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WriteEmployeeSerial{

    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        emp[0]= new Employee(101, "Ashish", 2000);
        emp[1] = new Employee(201, "Swapnil", 3000);
        emp[2]  = new Employee(301, "Karan", 4000);
        Employee emp1 = new Employee(301, "Karan", 4000);
        System.out.println("Object before Serializable: "+emp1);

        try {
            FileOutputStream fos = new FileOutputStream("Emp1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp1);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("+-----------------------------+");
        try {
            FileInputStream fis = new FileInputStream("Emp1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee serEmp = (Employee) ois.readObject();
            System.out.println("Employee after Serializable: "+ serEmp);
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("In Finally Block");
        }

        System.out.println("+To test object array+");
        System.out.println("Object before Serializable: ");
        for (Employee em:emp){
            System.out.println(em);
        }
        try {
            FileOutputStream fos = new FileOutputStream("Emp1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("+-----------------------------+");
        try {
            FileInputStream fis = new FileInputStream("Emp1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee serEmp[] = (Employee[]) ois.readObject();
            System.out.println("Employee after Serializable: ");
            for (Employee ser:serEmp){
                System.out.println(ser);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("In Finally Block");
        }
    }
}
