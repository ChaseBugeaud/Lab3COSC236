package Lab4;

import java.util.ArrayList;

public class Member {

  // GRASP Principle: Information Expert and Low Coupling
  // Can borrow and return books.

  private String name;
  ArrayList<Book> borrowedBooks = new ArrayList<>();

  public Member(String name) {
    this.name = name;

  }

  public void addBook(Book book) {
    borrowedBooks.add(book);
  }

  public void returnBook(Book book) {
    borrowedBooks.remove(book);
  }

  public String getName() {
    return name;
  }

  // private borrowedbBooks TODO: implement collection of borrowed books

  // TODO: implement functionality of Member class

}
