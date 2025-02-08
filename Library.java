// Create a class Library with:

// A static variable totalBooks.
// Instance variables for bookName and isAvailable.
// A static method getTotalBooks() that returns the total number of books in the library.

public class Library {
    static int totalBooks;
    String bookName;
    boolean isAvailable;

    public static int getTotalBooks(){
        return totalBooks;
    }

    public static void main(String[] args){
        Library.totalBooks = 100;
        System.out.println("Total books in the library: "+Library.getTotalBooks());
    }
}
