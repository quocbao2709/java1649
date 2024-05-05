package asm2_1649;



public class BookManager {
    private MyArrayList books;
    private int bookId;

    public BookManager() {
        books = new MyArrayList();
        bookId = 1;
    }

    public void addBook(String name, String title, String author, double price) {
        Book book = new Book(bookId, name, title, author, price);
        books.add(book);
        bookId++;
    }

    public void displayBooks() {
        System.out.println("List of Books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = (Book) books.get(i);
            book.displayInfo();
        }
    }

    public MyArrayList searchBooks(String keyword) {
        MyArrayList searchResults = new MyArrayList();
        for (int i = 0; i < books.size(); i++) {
            Book book = (Book) books.get(i);
            if (book.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }


}
