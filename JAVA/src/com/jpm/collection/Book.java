package com.jpm.collection;

import java.io.Serializable;

public class Book implements Serializable {
    int bookid;
    String bname;

    @Override
    public String toString() {
        return "StudentForSerliazationDemo{" +
                "bookid=" + bookid +
                ", bname='" + bname + '\'' +
                '}';
    }

    public Book(int bookid, String bname) {
        this.bookid = bookid;
        this.bname = bname;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
