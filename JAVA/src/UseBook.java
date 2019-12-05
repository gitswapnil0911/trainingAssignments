public class UseBook {
    public static void main(String[] args) {
        Book b1 = new Book(1, "ABC", "SAM", 1000);
        System.out.println(b1.displayBookDetails());
        b1.incrPrice(10);
        System.out.println(b1.displayBookDetails());

        Book books[] = new Book[3];
        books[0] = new Book(1, "ABC", "SAM", 1000);
        books[1] = new Book(2, "DEF", "PAT", 2000);
        books[2] = new Book(3, "GHI", "AKI", 3000);

        for (Book bk : books) {
            System.out.println(bk.displayBookDetails());
        }

        //Search Book
        int searchbook = 2;
        boolean flag = false;

        for (Book book : books) {
            if (book.getBookNo() == searchbook) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Book Found");
        } else
            System.out.println("Book Not Found");

        //Icrement Price
        for(Book book : books){
            book.incrPrice(5);
            System.out.println(book.displayBookDetails());
        }
    }
}

