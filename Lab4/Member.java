package Lab4;

import java.util.ArrayList;

public class Member {

  // GRASP Principle: Information Expert and Low Coupling
  // Can borrow and return books.

  private String name;
  private String memberId;
  ArrayList<Book> borrowedBooks = new ArrayList<>();

  public Member(String name, String memberId) {
    this.name = name;
    this.memberId = memberId;
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

  public String getMemberId() {
    return memberId;
  }

  // private borrowedbBooks TODO: implement collection of borrowed books

  // TODO: implement functionality of Member class

}
