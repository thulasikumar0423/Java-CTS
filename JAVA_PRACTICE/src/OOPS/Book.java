package OOPS;


    class Book {

        // 🔒 Data hiding
        private String title;
        private String author;
        private String isbn;
        private int availableCopies;

        // Constructor
        public Book(String title, String author, String isbn, int copies) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.availableCopies = copies;
        }

        // Check availability
        public boolean isAvailable() {
            return availableCopies > 0;
        }

        // Checkout book
        public void checkoutBook() {
            if (availableCopies > 0) {
                availableCopies--;
                System.out.println(title + " checked out successfully.");
            } else {
                System.out.println(title + " is currently not available.");
            }
        }

        // Return book
        public void returnBook() {
            availableCopies++;
            System.out.println(title + " returned successfully.");
        }

        // Display details
        public void displayBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Available Copies: " + availableCopies);
            System.out.println("---------------------------");
        }
    }


