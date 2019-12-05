package com.jpm.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    List<String> names=new ArrayList<String>();

    public void setNames(String s){
        names.add(s);
    }

    public void searchName(int i){
        System.out.println(names.get(i));
    }

    public void printNames(){
        Iterator<String> it=names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void removeName(String s){
        names.remove(s);
        }


    public void searchName(String s){
        int i=names.indexOf(s);
        System.out.println(names.get(i));

    }
}



