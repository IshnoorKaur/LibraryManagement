# Project Title: Book Lending

Simple overview of use/purpose.

## Description

This project provides a simple implementation of a library book management system using Java. It includes a Book class that represents a book with title, author, and borrowed status. Users can create, borrow, and return books using the provided methods. The Runner class demonstrates the features of the Book class by creating and manipulating book objects.

## Getting Started

### Dependencies

* Describe any prerequisites, libraries, OS version, etc., needed before installing and running your program.

Java Development Kit (JDK) installed on your system.


### Executing program
```
1. Compile the Java files 
    - javac book/Book.java
    - javac book/Runner.java
    - or just use javac *.java

2. Run the program:
    - java book.Runner
```
```
If you are using gradle 
1. gradle build 
2. gradle echo
3. Use the link provided under "To run the program from class files"
4. Paste it on termial to run the program 
```
Expected Output:


    Book details:
    : 

    Book details:
    Romeo and Juliet: William Shakespeare

    Borrowing Book 1: Romeo and Juliet
    Is Book 1 Borrowed? true
    Returning Book 1: true
    Is Book 1 Borrowed? false

    Borrowed book 1 Again: Romeo and Juliet

    Book 2 details: Educated: Tara Westover
    Is Book 2 borrowed? true

## Limitations

What isn't done? What things cause errors? 
- It is designed for educational purposes and it is not suitable for real world library managment. 
- Minimal error handling, for instance it does not prevent setting the book title or author to an empty string.

## Author Information

Name: Ishnoor Kaur 

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [simple-readme] (https://gist.githubusercontent.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc/raw/d59043abbb123089ad6602aba571121b71d91d7f/README-Template.md)



