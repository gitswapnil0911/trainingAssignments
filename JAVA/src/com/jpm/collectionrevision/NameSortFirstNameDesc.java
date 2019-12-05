package com.jpm.collectionrevision;

import java.util.Comparator;

public class NameSortFirstNameDesc implements Comparator<Name> {
    @Override
    public int compare(Name n1, Name n2) {
        String name1 = n1.getFirstName();
        String name2 = n2.getFirstName();
        int comparison = name2.compareTo(name1);
        //Code for further equals check
        if(comparison == 0)
            comparison=1;
        return comparison;
    }
}
