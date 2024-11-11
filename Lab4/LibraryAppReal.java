
public class LibraryAppReal {

  public static void main(String[] args) {
    LibrarianController controlla = new LibrarianController();

    controlla.addBookToLibrary("Dune", "Kody");
    controlla.addMemberToLibrary("Frank");

    controlla.rentBook("Dune", "Frank");

    controlla.returnBook("Dune", "Frank");

  }

}
