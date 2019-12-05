import java.util.Scanner;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    public Book(int bookNo, String title, String author, float price) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

      public String displayBookDetails() {
        return "Book{" +
                "bookNo=" + bookNo +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void incrPrice(double percentage){
        price += (price/percentage);
    }


}
