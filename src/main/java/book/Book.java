package book;

public class Book {

  // private instance variables
  private String bookTitle;
  private String bookAuthor;
  private boolean borrowedBook;

  // package private mutator methods
  void setTitle(String title) {
    this.bookTitle = title.trim();
  }

  void setAuthor(String author) {
    this.bookAuthor = author.trim();
  }

  void setBorrowed(boolean borrowed) {
    this.borrowedBook = borrowed;
  }

  // package private accessor methods
  public String getTitle() {
    return bookTitle;
  }

  public String getAuthor() {
    return bookAuthor;
  }

  public boolean isBorrowed() {
    return this.borrowedBook;
  }

  /*
   * Borrowing the book if available. Returns title of book if book is available.
   * Sets the state of book borrowed. Returns empty string if book not available.
   */
  public String borrow() {
    if (this.isBorrowed()) {
      return "";
    } else {
      this.setBorrowed(true);
      return this.bookTitle;
    }
  }

  /*
   * Retruns if book state is borrowed. Sets book state to available.
   * Returns false if book was already available.
   */
  public boolean giveBack() {
    if (!this.isBorrowed()) {
      return false; // Book was already available
    } else {
      this.setBorrowed(false);
      return true; // Book was successfully returned
    }
  }

  /*
   * Returns the string consisting of title of the book followed by colon and a
   * space followed by author of the book.
   */
  @Override
  public String toString() {

    return this.getTitle() + ": " + this.getAuthor();
  }

}
