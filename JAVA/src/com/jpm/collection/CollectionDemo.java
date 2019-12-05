package com.jpm.collection;

import javax.xml.transform.sax.SAXSource;
import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("aaa");
        names.add("bbb");
        names.add("ccc");
        names.add("ddd");
        names.add("abcdsf");
        System.out.println(names);
        for (String s:names) {
            System.out.println(s.length());
        }

        Iterator it=names.iterator();
         while(it.hasNext()){
             String s= (String)it.next();
             System.out.println(s.length() + " : " + s);
         }
    }
}