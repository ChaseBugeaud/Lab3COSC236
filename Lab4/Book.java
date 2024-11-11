
public class Book {

  // GRASP Principle: Information Expert
  // Manages its own state (available or borrowed)
  // DONE: implement Book functionality

  // Variables
  private String title;
  private boolean isAvailable;
  private String author;

  // constructor
  public Book(String title, String author, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.isAvailable = isAvailable;
  }

  // set methods
  public void setIsAvailable(boolean newAvailability) {
    this.isAvailable = newAvailability;
  }

  // Get methods
  public boolean getIsAvailable() {
    return this.isAvailable;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }
}
