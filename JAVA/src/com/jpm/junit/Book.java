package com.jpm.junit;

public class Book {
    int bookid;
    String bname;
    String author;
    int price;
    String desc;
    public Book() {}
    public Book(int bookid, String bname, String author, int price, String desc) {
        this.bookid = bookid;
        this.bname = bname;
        this.author = author;
        this.price = price;
        this.desc = desc;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
