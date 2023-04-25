package org.example;

public class Book {
    public Book( int id, String isbn, String title,boolean isCheckedOut,String checkedOutTo ){
        this.id = id;
        this.isbn =isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
        }

    //include the properties( id:int, isbn:String, title:String, isCheckedOut:boolean, checkedOutToString
    private int id;
    private String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String checkedOutTo;

    //create book class with appropriate getters, setters, constructor, and methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }




    //include the Methods -checkOut(name)- checkIn
    public void checkOut(String name){
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    public void checkIn(){
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
    //Use an array to hold an inventory of at least 5 books of your choice
    //When a book is checked out
    //the books checkedOutTo variab;le should set to the name provided
    // the isCheckedOut variable should be set to true
    // When a book is checked in
    //the books checkedOutTo variable should be set to''
    //the isCheckedOut variable should be set to false

    // The Store Home Screen- The home screen should display a list of options that a user can choose from.
    //Show Available Books
    //Show Checked Out Books
    //Exit- closes out of the application

    //Show Available org.example.Book
    // Displays a list of all books that are not currently checked out. Display the Id, ISBN and Title of the book.

    //Prompt the user to either select a book to check out, or exit to go back to the homescreen
    //if the user wants to check out a book, prompt them for their name
    // Then check out the book

    //Show Checked Out books.
    //this displays a list of all the books that are currently checked out. Display the id, ISBN, title and Name of the
    // person who has the book checked out. prompt the user to --------  C-to Check In a book
    // X - to go back to the Home screen

    //Check In a book-- Prompt the user for the ID of the book they want to check in
         //Check in the book with the specified id
         // go back to home screen
}
