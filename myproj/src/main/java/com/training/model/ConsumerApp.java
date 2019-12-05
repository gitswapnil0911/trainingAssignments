package com.training.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsumerApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Baning portal");
        System.out.println("Select Your Bank:");
        System.out.println("1. ICICI");
        System.out.println("2. Standard Charter");
        System.out.println("3. Axis");
        System.out.println("4. SBI");
        int bankChoice = sc.nextInt();

        System.out.println("Select Your Operation:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrwal");
        System.out.println("3. Open FD");
        int operationChoice= sc.nextInt();




    }
}
