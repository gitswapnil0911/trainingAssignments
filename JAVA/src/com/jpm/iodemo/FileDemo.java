package com.jpm.iodemo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("names.txt");
        System.out.println(file.canRead());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

    }
}
