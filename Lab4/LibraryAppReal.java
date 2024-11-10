package Lab4;

public class LibraryAppReal {

	public static void main(String[] args) {
		LibrarianController controller = new LibrarianController();
		
		controller.addBookToLibrary("Dune", "Kody");
		controller.addMemberToLibrary("Frank");
		
		
		controller.rentBook("Dune", "Frank");
		
		controller.returnBook("Dune", "Frank");

	}

}
