package com.jpm.iodemo;

import java.io.*;

public class DataIOStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos= new FileOutputStream("nos.txt");
            DataOutputStream dos= new DataOutputStream(fos);
            dos.writeInt(101);
            dos.writeInt(102);
            dos.writeInt(103);
                        dos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream fis= null;
        try {
            fis = new FileInputStream("nos.txt");
            DataInputStream dis =new DataInputStream(fis);
            int sum;
            sum = dis.readInt()+dis.readInt()+dis.readInt();
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
