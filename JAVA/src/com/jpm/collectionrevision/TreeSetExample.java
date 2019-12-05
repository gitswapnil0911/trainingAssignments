package com.jpm.collectionrevision;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Comparator<Name> comp1= new NameSortFirstNameDesc();//custom logic
        Comparator<Name> exp = //On the left hand is the interface to which method belongs to
                (nm1,nm2) -> {//Values in the bracket has to match the signature of the method which you are trying to do implementation
                    String name1 = nm1.getFirstName();
                    String name2 = nm2.getFirstName();
                    int comparison = name2.compareTo(name1);
                    //Code for further equals check
                    if(comparison == 0)
                        comparison=1;
                    return comparison;

                };
        //SortedSet<Name> names = new TreeSet(comp1);
        //SortedSet<Name> names = new TreeSet<>(new NameSortFirstNameDescUsingMethodRef()::comp1);//Compare Using Method refrencing
        SortedSet<Name> names = new TreeSet(exp);
        names.add(new Name());
        names.add(new Name("Pat","Palav"));
        names.add(new Name("Sandy","Jadhav"));
        names.add(new Name("Mang","Shinde"));
        names.add(new Name("Jeeya","KAD"));
        names.add(new Name("Reena","Zap"));
        names.add(new Name("Sam","Sum"));
        names.add(new Name("Sam","Dam"));

        for (Object val: names) {
            System.out.println(val);
        }


    }
}
