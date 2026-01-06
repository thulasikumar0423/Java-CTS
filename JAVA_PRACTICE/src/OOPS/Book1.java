package OOPS;

public class Book1 {


        public static void main(String[] args) {

            Book book1 = new Book("Java Basics", "James Gosling", "ISBN101", 2);
            Book book2 = new Book("Spring Boot", "Pivotal", "ISBN102", 1);
            Book book3 = new Book("Data Structures", "Mark Allen", "ISBN103", 0);

            book1.displayBookInfo();
            book2.displayBookInfo();
            book3.displayBookInfo();

            // Checkout books
            book1.checkoutBook();
            book3.checkoutBook();  // not available
        }
    }


