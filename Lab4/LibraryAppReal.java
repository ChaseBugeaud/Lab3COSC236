package Lab4;

public class LibraryAppReal {

  public static void main(String[] args) {
    LibrarianController controlla = new LibrarianController();

    controlla.addBookToLibrary("Dune", "Kody");
    controlla.addMemberToLibrary("Frank");
    controlla.addMemberToLibrary("Liam");
    controlla.addMemberToLibrary("Tanner");

    controlla.rentBook("Dune", "Frank");

    controlla.returnBook("Dune", "Frank");
    
    
    controlla.addBookToLibrary("Hunger Games", "idk");
    controlla.addBookToLibrary("Maze game", "No clue");
    
    controlla.showAllBooks();
    controlla.showAllMembers();
    
    controlla.getMemberByName("bob");
    controlla.getMemberByName("Frank");
    
    controlla.getBookByTitle("test");
    controlla.getBookByTitle("Dune");

  }

}
