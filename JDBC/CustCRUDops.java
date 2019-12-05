package com.jpm.XYZ.JDBC;

import java.util.Scanner;

public class CustCRUDops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerDAO opt = new CustomerDAO();
        Customer cust = new Customer();
        int custid,contactNo;
        String custName, address, dob;

        System.out.println("Please select the desired menu option");
        System.out.println("1. Insert new Customer details.");
        System.out.println("2. Update the customer details.");
        System.out.println("3. Delete the customer record");
        System.out.println("4. Display all customer details");
        System.out.println("5. Exit from the menu and terminate the program");
        int option = sc.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Enter Customer ID:");
                custid = sc.nextInt();
                System.out.println("Enter Customer Name:");
                custName = sc.next();
                System.out.println("Enetr Customer contact no:");
                contactNo = sc.nextInt();
                System.out.println("Enter Customer Address:");
                address = sc.next();
                System.out.println("Enter Customer Date of birth in 'DD-MMM-YY' format:");
                dob = sc.next();
                Customer cust1  = new Customer(custid,custName,contactNo, address,dob );
                opt.insert(cust1);
                break;

            case 2:
                System.out.println("Enter Customer ID to update the contact no:");
                custid = sc.nextInt();
                System.out.println("Enter Customer contact no:");
                contactNo = sc.nextInt();
                opt.update(custid, contactNo);
                break;

            case 3:
                System.out.println("Enter Customer ID to delete a customer:");
                custid = sc.nextInt();
                opt.delete(custid);
                break;

            case 4:
                System.out.println("Display all customer details:");
                opt.display();
                break;

            default:
                System.out.println("Exiting the application!!!");
        }
    }
}
