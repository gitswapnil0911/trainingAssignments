package com.jpm.collection;
import java.util.Iterator;
import java.util.TreeSet;

public class EmpTreeSet {
    public static void main(String[] args) {
    TreeSet<Emp> eset = new TreeSet<Emp>();
    for (int i=0;i<5;i++){

        Emp ec= new Emp(i,"Swapnil"+i,500+i);
        eset.add(ec);

    }
        System.out.println(eset.size());
        Iterator<Emp> it=eset.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
}
}
