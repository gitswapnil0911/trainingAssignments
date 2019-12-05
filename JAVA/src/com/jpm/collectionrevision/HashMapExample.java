package com.jpm.collectionrevision;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Name> names = new HashMap<>();
        names.put(1,new Name());
        names.put(2,new Name("Pat","Palav"));
        names.put(3,new Name("Sandy","Jadhav"));
        names.put(4,new Name("Mang","Shinde"));
        names.put(5,new Name("Jeeya","KAD"));
        names.put(6,new Name("Reena","Zap"));
        names.put(7,new Name("Sam","Sum"));

        Set<Integer> srNos=names.keySet();
        for (Integer srNo: srNos) {
            Name nm= names.get(srNo);
            System.out.println(srNo+": "+nm);
        }

        Collection<Name> nameVals=names.values();//Want to get values directly from collection object hence Collection is used
        for (Name nm: nameVals) {
            System.out.println(nm);

        }

    }
}
