package com.jpm.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> list=new LinkedList<>();
        list.add("aaa");
        list.add("kkk");
        list.add("eee");
        list.offer("PPP");
        System.out.println(list);
    }
}
