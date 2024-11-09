package Lab4;

public class LibrarianController {

  // GRASP Principle: Controller
  // Handles user requests like borrowing and returning books.
  // Delegates tasks to the appropriate objects.

  Library library;

  public LibrarianController(Library library) {
    this.library = library;
  }

  public void addBookToLibrary(String title, String author) {
    this.library.createBook(title, author);
  }

  public void addMemberToLibrary(String name) {
    this.library.createMember(name);
  }

  public void rentBook(String bookName, String memberName) {
    this.library.rentBook(bookName, memberName);

  }

  public void returnBook(String bookName, String memberName) {
    this.library.returnBook(bookName, memberName);
  }

  public void showAllBooks() {
    library.showBooks();
  }

  public void showAllMembers() {
    library.showMembers();
  }

}
