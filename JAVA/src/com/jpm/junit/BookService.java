/*
package com.jpm.junit;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    List<Book> books = new ArrayList<Book>();
    public BookService() {
        books.add(new Book(101, "Head First jQuery", "Ryan Benedetti", 275, "book desc"));
                books.add(new Book(102,"jQuery in Action",	"BEAR BIBEAULT",400, "some desc"));
    }
    public List<Book> getAllBooks() {
        return books;
    }
    public Book getBookById(int id) {
        Book book1 = null;
        for (Book book : books) {
            if (id == book.getBookid()) {
                book1 = book;
            }
            return book1;
        }
        public Book getBookByName(String bookname) {
            for (Book book : books) {
                if (bookname.equals(book.getBname()))
                    return book;
            }
            return null;
        }
        public Book createBook(Book book) {
            books.add(book);
            return book;
        }
        public Book updateBook(int bid, Book book) {
            book.setBookid(bid);
            Book b1 = null;
            for (Book b : books) {
                if (book.getBookid() == b.getBookid()){
                    b.setBname(book.getBname());
                    b.setAuthor(book.getAuthor());
                    b.setPrice(book.getPrice());
                    b.setDesc(book.getDesc());
                    b1=b;
                }
            }
            return b1;
        }
        public boolean deleteBook(int id) {
            boolean flag = false;
            for (Book book : books) {
                if (id == book.getBookid())
                    flag = books.remove(book);
            }
            return flag;
        }}
*/
