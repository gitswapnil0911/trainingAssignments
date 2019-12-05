package com.jpm.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentOps {
    private Map<String,String> smap=new HashMap<>();
        public void setNames(String rn,String nm){
            smap.put(rn,nm);

    }

    public void printNames(){
        Set<String> skey= smap.keySet();
        for (String i:skey) {
            System.out.println(i + " : "+smap.get(i));
        }
    }

    public void printSize(){
        System.out.println(smap.size());


     }

     public void remove(String key){
        smap.remove(key);
     }

     public void getNames(String value){
         System.out.println(smap.containsValue(value));
     }
}


