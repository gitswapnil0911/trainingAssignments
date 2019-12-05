package com.jpm.collection;
import java.util.*;

public class TreeSetDemo {

    TreeSet<Integer> set=new TreeSet<Integer>();

    public static void main(String[] args) {
        TreeSetDemo t= new TreeSetDemo();
        t.setNumber(12);
        t.setNumber(14);
        t.setNumber(18);
        t.setNumber(19);
        t.setNumber(120);
        t.setNumber(210);
        t.setNumber(234);
        t.setNumber(432);
        t.setNumber(567);
        t.setNumber(987);
        t.reverse();
        t.lower(567);
        t.elower(567);
        t.removeFsLs();
        t.printNumbers();
        t.subset(12,210);
        t.fst();
        
    }
    public void printNumbers(){
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void setNumber(int i){
        set.add(i);
    }
     public void reverse(){
         System.out.println(set.descendingSet());
     }

     public void lower(int i){
         System.out.println(set.lower(i));
     }

    public void elower(int i){
        System.out.println(set.floor(i));
    }

    public void removeFsLs(){
        set.pollFirst();
        set.pollLast();

    }

    public void subset(int i, int j){
        System.out.println(set.subSet(i,j));
    }

    public void fst(){
        System.out.println(set.first());
    }


}
