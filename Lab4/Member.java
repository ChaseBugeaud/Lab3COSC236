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
    System.out.println(book.getTitle() + " has been rented");
    borrowedBooks.add(book);
    book.setIsAvailable(false);
  }

  public void returnBook(Book book) {
    borrowedBooks.remove(book);
    book.setIsAvailable(true);
  }

  public String getName() {
    return name;
  }
}
