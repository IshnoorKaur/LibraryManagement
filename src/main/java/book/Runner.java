package book;

public class Runner {
  public static void main(String[] args) {

    // create instances of book and demonstrate their features
    Book book = new Book();
    book.setTitle("");
    book.setAuthor("");
    System.out.println("Book details: \n" + book.toString());

    // Create book and print details about it
    Book book1 = new Book();
    book1.setTitle("Romeo and Juliet");
    book1.setAuthor("William Shakespeare");
    System.out.println("Book details: \n" + book1.toString());
    System.out.println("\n");

    // Borrow and give back the book
    System.out.println("Borrowing Book 1: " + book1.borrow());
    System.out.println("Is Book 1 Borrowed? " + book1.isBorrowed());
    System.out.println("Returning Book 1: " + book1.giveBack());
    System.out.println("Is Book 1 Borrowed? " + book1.isBorrowed());
    System.out.println("\n");

    // Attempt to borrow a borrowed book
    System.out.println("Borrowed book 1 Again: " + book1.borrow());
    System.out.println("\n");

    // Create a book which is already borrowed
    Book book2 = new Book();
    book2.setTitle("Educated");
    book2.setAuthor("Tara Westover");
    book2.setBorrowed(true);
    System.out.println("Book 2 details: " + book2.toString());
    System.out.println("Is Book 2 borrowed? " + book2.isBorrowed());
    System.out.println("\n");

  }
}
