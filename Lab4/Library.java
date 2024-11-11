
import java.util.ArrayList;

public class Library {

  public Library() {

  }

  private ArrayList<Book> catalog = new ArrayList<>();
  private ArrayList<Member> members = new ArrayList<>();

  public void createBook(String title, String author) {
    Book book = new Book(title, author, true);
    catalog.add(book);
  }

  public void createMember(String name) {
    Member member = new Member(name);
    members.add(member);
  }

  public Member getMemberByName(String name) {
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getName().equals(name)) {
        return members.get(i);
      }
    }
    return null;
  }

  public Book getBookByTitle(String name) {
    for (int i = 0; i < catalog.size(); i++) {
      if (catalog.get(i).getTitle().equals(name)) {
        return catalog.get(i);
      }
    }
    return null;
  }

  public void showBooks() {
    for (Book b : catalog) {
      System.out.println(b.getTitle());
    }
  }

  public void showMembers() {
    for (Member m : members) {
      System.out.println(m.getName());
    }
  }

  public void rentBook(String title, String name) {
    Book book = getBookByTitle(title);
    Member member = getMemberByName(name);

    if (book == null) {
      System.out.println(title + " not found");

    } else if (member == null) {

      System.out.println(name + " not found");
    } else if (!book.getIsAvailable()) {

      System.out.println(title + " not available");
    } else {

      member.addBook(book);
      book.setIsAvailable(false);
      System.out.println(name + " rented " + title + " successfully");
    }
  }

  public void returnBook(String title, String name) {
    Book book = getBookByTitle(title);
    Member member = getMemberByName(name);

    if (book == null) {

      System.out.println(name + " not found");
    } else if (member == null) {

      System.out.println(name + " not found");
    } else {

      member.returnBook(book);
      book.setIsAvailable(true);
      System.out.println(name + " returned " + title + " successfully");
    }
  }

  public void removeMember(Member member) {
    members.remove(member);
  }

  // GRASP Principles: Creator, Controller
  // Manage the catalog of books and members.
  // Track which books are borrowed and available

  // Attributes:
  // private catalog (list of Book)
  // private members (list of Members)

  // TODO: implement functionality of Member class

}
