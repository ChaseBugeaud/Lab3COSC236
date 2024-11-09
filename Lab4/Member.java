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

  public void addBook(Book name) {
    borrowedBooks.add(name);
  }

  public void returnBook(Book name) {
    borrowedBooks.remove(name);
  }

  public String getName() {
    return name;
  }


  // private borrowedbBooks TODO: implement collection of borrowed books

  // TODO: implement functionality of Member class

}
