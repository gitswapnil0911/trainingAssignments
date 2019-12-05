package com.jpm.collectionrevision;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Name> names = new HashSet<>();
        names.add(new Name());
        names.add(new Name("Pat","Palav"));
        names.add(new Name("Sandy","Jadhav"));
        names.add(new Name("Mang","Shinde"));
        names.add(new Name("Jeeya","KAD"));
        names.add(new Name("Reena","Zap"));
        names.add(new Name("Sam","Sum"));

        for (Name name : names)
            System.out.println(name);
    }
}
