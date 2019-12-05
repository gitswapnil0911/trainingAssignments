package com.jpm.moduleassesment;
import com.jpm.collection.Emp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;
/* Class containing various operations on Employee*/

public class EmpOperations<E> {

    List<Employee> elist = new LinkedList<>(); //Creating Linkedlist

    public void addEmployee(Employee e) { //Method to add employee object to Linked list

        elist.add(e);

        System.out.println("Employee successfully added");

    }

    public void deleteEmp(int empid) {

        Iterator<Employee> it = elist.iterator();
        boolean flag = false;
        while (it.hasNext()) {
            Employee s = it.next();
            if (s.getEmpid() == empid) {
                it.remove();
                System.out.println("Employee id " + empid + "is deleted");
                flag = true;

            }
        }

    }


    public Employee searchEmpById(int empid) {
        Iterator<Employee> it = elist.iterator();
        while (it.hasNext()) {
            Employee s = it.next();
            if (s.getEmpid() == empid) {
                return s;
            }
        }
        return null;


    }


    public void displayAllEmpDetails() {
        for (Employee e : elist) {
            e.displayDetail();
        }

    }

    public List<String> getEmpNames() {
        ArrayList<String> list = new ArrayList();
        Iterator it = elist.iterator();
        while (it.hasNext()) {

            Employee e = (Employee) it.next();
            list.add(e.getEname());
        }
        return list;
    }
}
