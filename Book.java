public class Book{
    String Title;
    String Author;
    double Price;

    public Book(){
      Title = "";
      Author = "";
      Price = 0.0;
    }

    public Book(String title,String author, Double price){
      Title = title;
      Author = author;
      Price = price;
    }

    public void printBookDetails(){
      System.out.println("Title: "+Title);
      System.out.println("Author: "+Author);
      System.out.printf("Price: %.2f",Price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 550.0);
        book1.printBookDetails();
    }
}