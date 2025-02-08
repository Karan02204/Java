// Create a class Book with:

// Instance variables title, author, and price.
// A constructor that initializes all fields using the this keyword.
// Write a method printDetails() to display the book information.

public class Book1{
    String title , author;
    double price;

    Book1(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.printf("Price: %.2f",price);
    }

    public static void main(String[] args){
        Book1 book1 = new Book1("Percy Jackson" , "Rick Riordan" , 450.0);
        book1.printDetails();
    }
}