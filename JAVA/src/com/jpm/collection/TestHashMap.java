package com.jpm.collection;

public class TestHashMap {
    public static void main(String[] args) {
        StudentOps so =new StudentOps();
        so.setNames("1","S");
        so.setNames("2","A");
        so.setNames("3","F");
        so.setNames("4","T");
        so.setNames("5","N");
        so.setNames("6","P");
        so.setNames("7","Q");
        so.setNames("8","R");
        //so.printNames();
        //so.getNames("S");
        //so.printSize(); // working
        so.remove("7"); //Working
        so.printNames();
    }
}
