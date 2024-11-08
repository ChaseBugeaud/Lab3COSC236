package Lab4;

public class LibrarianController {

  // GRASP Principle: Controller
  // Handles user requests like borrowing and returning books.
  // Delegates tasks to the appropriate objects.

  // TODO: implement functionality of Member class
	
	Library library;
	
	
	public LibrarianController(Library library) {
		this.library = library;
	}
	
}
