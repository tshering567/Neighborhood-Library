package org.example;
import java.util.Scanner;
public class Screens {
    public static void main(String[] args) {
        System.out.println("Main Menu: ");
        System.out.println("1) Show Available Books");
        System.out.println("2) Show Checked out Books");
        System.out.println("3) Exit");

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
        System.out.println("This are the available books: ");
        for(Book book: books){ //for each book inside of the list of books
            if (book.getCheckedOut()== false){
                System.out.println(
                        book.getId() + " " +
                                book.getIsbn() + " " +
                                book.getTitle()
                );

            }

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a  id to check out ");
        System.out.println(" OR press 0 to Exit to menu");

        int bookId = scanner.nextInt();
        if (bookId==0){
            main(null);
        }

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
        System.out.println("These are the checked out books: ");
        for(Book book: books){ //for each book inside of the list of books
            if (book.getCheckedOut()== true){
                System.out.println(
                        book.getId() + " " +
                                book.getIsbn() + " " +
                                book.getTitle() + " " +
                                book.getCheckedOutTo()
                );

            }

        }
        System.out.println("Press C to check in a book ");
        System.out.println("Or press X to go to the main menu");
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

        System.out.println("Your book was checked in successfully.");
        main(null);
    }
}
