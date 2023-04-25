package org.example;
import java.util.Scanner;
public class Screens {
    public static void main(String[] args) {
        // The Store Home Screen.The home screen should display a list of options that a user can choose from.
        System.out.println("Main Menu: ");
        System.out.println("1) Show Available Books");  //Show Available Books
        System.out.println("2) Show Checked out Books"); //Show Checked Out Books
        System.out.println("3) Exit"); //"Exit" closes out of the application

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("1")){
            available();
        }
        else if (input.equals("2")) {
            checkedOut();
        }
    }
    public static void available(){
        Book[] books = Inventory.Inventory; //access inventory of books
        System.out.println("This are the available books: ");  //Show Available org.example.Book
        for(Book book: books){ //for each book inside the list of books
            // Displays a list of all books that are not currently checked out.
            // Display the id, ISBN and Title of the book.
            // When a book is checked in
            //the isCheckedOut variable should be set to false
            if (!book.getCheckedOut()){
                System.out.println(
                        book.getId() + " " +
                                book.getIsbn() + " " +
                                book.getTitle()
                );

            }

        }
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to either select a book to check out, or exit to go back to the home screen.
        System.out.println("Choose a  id to check out ");
        System.out.println(" OR press 0 to Exit to menu");

        int bookId = scanner.nextInt();
        if (bookId==0){
            main(null);
        }
        //if the user wants to check out a book, prompt them for their name
        // Then check out the book
        //Show Checked Out books.
        scanner.nextLine();
        for (Book thisBook: books){
            if (thisBook.getId() == bookId){
                System.out.println("Please provide your name: ");
                String username = scanner.nextLine();
                thisBook.checkOut(username);
                System.out.println("Your book was checked out successfully");
                main(null);

            }
        }

    }

    public static void checkedOut() {
        Book[] books = Inventory.Inventory; //access inventory of books
        //When a book is checked out
        //the books checkedOutTo variable should set to the name provided
        // the isCheckedOut variable should be set to true
        System.out.println("These are the checked out books: ");
        for(Book book: books){ //for each book inside the list of books
            if (book.getCheckedOut()){
                System.out.println(
                        book.getId() + " " +
                                book.getIsbn() + " " +
                                book.getTitle() + " " +
                                book.getCheckedOutTo()
                        //this displays a list of all the books that are currently checked out.
                        // Displays the id, ISBN, title and Name of the person who has the book checked out.
                );

            }

        }
        System.out.println("Press C to check in a book "); // prompt the user to --------  C-to Check In a book
        System.out.println("Or press X to go to the main menu"); // X - to go back to the Home screen
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("C")) {
            checkIn();
        } else if (input.equals("X")) {
            main(null);
        }
    }

    public static void checkIn() {
        Book[] books = Inventory.Inventory;
        Scanner scanner = new Scanner(System.in);
        //Check In a book-- Prompt the user for the ID of the book they want to check in
        System.out.println("Choose a  id to check in ");
        System.out.println(" OR press 0 to Exit to the main menu");

        int bookId = scanner.nextInt();
        if (bookId==0){
            main(null);
        }

        scanner.nextLine();
        for (Book thisBook: books){
            if (thisBook.getId() == bookId){
                thisBook.checkIn();
            }
        }
        //Check in the book with the specified id
        System.out.println("Your book was checked in successfully.");
        main(null);
    }
}
