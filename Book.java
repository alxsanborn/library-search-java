import java.applet.Applet;
import java.awt.Graphics;
//name of the Java file must be the same name as the class

class Book {
  String title;
  String author;
  int year;
  int isbn;
  //Without declaring this up here, yields a "cannot find symbol" error; instance variables must be declared up here?

  public Book(String bookTitle, String bookAuthor, int bookYear, int bookISBN) { //argument is locally passed here
    this.title = bookTitle;
    this.author = bookAuthor;
    this.year = bookYear;
    this.isbn = bookISBN;
  }
  //Trying to initialize the object without this (constructor) yields "constructor Book in class Book cannot be applied to given types" error

  public String getTitle() {
    return title;
  }
  //getter method

  public static void main (String[] args){
    Book coffee = new Book("How to Make Coffee", "author", 1900, 11111);
    Book dogs = new Book("Dogs", "author", 1904, 22222);
    Book cats = new Book("Cats", "author", 1894, 3333);
    Book smoothies = new Book("How to Make Smoothies", "author", 1956, 44444);
    Book cars = new Book("Cars", "author", 1783, 5555);
    Book history = new Book("The History of Coffee", "author", 1534, 6666);

    String catsTitle = cats.getTitle();
    System.out.println(catsTitle);
  }

}
