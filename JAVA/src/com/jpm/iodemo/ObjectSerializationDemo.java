package com.jpm.iodemo;

import com.jpm.collection.Book;

import java.io.*;

public class ObjectSerializationDemo{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book book =new Book(101,"JAVA");
        System.out.println(book);
        FileOutputStream fos=new FileOutputStream("book.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(book);
        oos.close();
        fos.close();

        Book serBook=null;
        FileInputStream fis=new FileInputStream("book.dat");
        ObjectInputStream ois=new ObjectInputStream(fis);
        serBook=(Book)ois.readObject();//Need to type cast to Book otherwise it will refer to Superclass
        System.out.println(serBook);

    }
}
