package com.jpm.XYZ;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteEmployeeFile{

    public static void main(String[] args) {
        Employee emp =new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EmployeeDetails:");
        String str="";

        try {
            FileWriter fw = new FileWriter("EmpFile.txt",true);
            BufferedWriter br = new BufferedWriter(fw);
            System.out.println("Enter Employee ID:");
            emp.setEmpNo(sc.nextInt());
            System.out.println("Enter Employee Name:");
            emp.setEmpName(sc.next());
            System.out.println("Enter Employee Basic:");
            emp.setEmpBasic(sc.nextInt());
            str =  emp.getEmpNo()  + " : " + emp.getEmpName() + " : "+ emp.getEmpBasic()+"\n";
            System.out.println("Employee  details before entering into file: "+str);
            br.write(str);
//            br.write("\n");
            br.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Modify the above assignment : Read employee details, recreate the employee object, store into a List<Employee> .
                Iterate thru list and display all employee information.*/
         List<Employee> ls = new ArrayList<>();
        try {
            FileReader fr = new FileReader("EmpFile.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("Employee  details after from file: ");
           while ((line = br.readLine())!=null)
           {
               System.out.println(line);
               String[] word= line.split(" : ");
               ls.add(new Employee(Integer.parseInt(word[0]),word[1],Integer.parseInt(word[2])));
           }
           br.close();
           fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Employee details from Array List: ");
        System.out.println(ls);
    }
}
