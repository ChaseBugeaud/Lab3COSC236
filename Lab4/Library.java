package Lab4;

import java.util.ArrayList;

public class Library {
	
	
	private ArrayList<Book> catalog = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();
	
	public void createBook(String title, String author) {
		Book book = new Book(title,author, true);
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
	
	public void withdrawBook(Book book) {
		catalog.remove(book);
	}	
	public void removeMember(Member member) {
		members.remove(member);
	}
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// TODO: implement functionality of Member class

}
