package com.jpm.iodemo;

import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        char[] arr=new char[80];
        try {
            Reader fr= new FileReader("names.txt");
            BufferedReader br=new BufferedReader(fr);
            LineNumberReader lr=new LineNumberReader(br);
                //fr.read(arr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            while((line=lr.readLine())!=null){
                System.out.println(lr.getLineNumber()+" "+line);
            }
            //String str=new String(arr);
            //System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Writer fw= new FileWriter("names.txt",true);
            fw.write("EEE");
            fw.close();
              } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
