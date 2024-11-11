package Lab4;
public class LibrarianController {

  // GRASP Principle: Controller
  // Handles user requests like borrowing and returning books.
  // Delegates tasks to the appropriate objects.

  private Library library;

  public LibrarianController() {
    this.library = new Library();
  }

  public void addBookToLibrary(String title, String author) {
    library.createBook(title, author);
  }

  public void addMemberToLibrary(String name) {
    library.createMember(name);
  }

  public void rentBook(String bookName, String memberName) {
    library.rentBook(bookName, memberName);

  }

  public void returnBook(String bookName, String memberName) {
    library.returnBook(bookName, memberName);
  }

  public void showAllBooks() {
    library.showBooks();
  }

  public void showAllMembers() {
    library.showMembers();
  }
  public void getMemberByName(String name) {
      if(library.getMemberByName(name)!= null) {
          System.out.println(name + " is in the database!");
      }else{
          System.out.println(name + " is not in the databse!");
      }
  }
  public void getBookByTitle(String name) {
      if(library.getBookByTitle(name)!= null) {
          System.out.println(name + " is in the library!");
      }else{
          System.out.println(name + " is not in the library!");
      }
  }

}

