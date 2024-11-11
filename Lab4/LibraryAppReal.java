package Lab4;

public class LibraryAppReal {

  public static void main(String[] args) {
    LibrarianController controlla = new LibrarianController();

    controlla.addBookToLibrary("Dune", "Kody");
    controlla.addMemberToLibrary("Frank");
    controlla.addBookToLibrary("Harry potta", "Kody");
    controlla.addBookToLibrary("My Diary", "Kody");
    controlla.rentBook("Dune", "Frank");

    controlla.returnBook("Dune", "Frank");
    
    controlla.addMemberToLibrary("Liam");
    controlla.addMemberToLibrary("chase");
    controlla.addMemberToLibrary("Haniel");
    
    
    controlla.getBookByTitle("My Diary");
    controlla.getMemberByName("Liam");
    System.out.println("All books:");
    controlla.showAllBooks();
    System.out.println("All members:");
    controlla.showAllMembers();
  }

}
