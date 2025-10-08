import java.util.ArrayList;
import java.util.Scanner;

public class BookDriver {
    static ArrayList<Book> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static Integer mainChoice = 0;
    public static Integer bookChoice = 0;

    public static void main(String[] args) {

        while (mainChoice != 2) {
            showMainMenu();
            mainChoice = scanner.nextInt();
            if (mainChoice == 1) {
                bookChoice = 0;
                while (bookChoice != 5) {
                    showBookMenu();
                    bookChoice = scanner.nextInt();
                    if (bookChoice == 1) {
                        addBook();
                    } else if (bookChoice == 2) {
                        editBook();
                    } else if (bookChoice == 3) {
                        removeBook();
                    } else if (bookChoice == 4) {
                        displayAllBooks();
                    } else if (bookChoice == 5) {
                        System.out.println("Exiting Book Menu");
                    } else {
                        System.out.println("Please enter a number from the menu");
                    }
                }
            }
        }
    }


    private static void showBookMenu() {
        System.out.println("""
                ===== Book Menu =====
                1- Add a New Book
                2- Edit an Existing Book
                3- Remove Book
                4- Display All Books
                5- Exit
                =====================""");
        System.out.print("Enter your choice: ");
    }

    private static void showMainMenu() {
        System.out.println("Welcome to the Library");
        System.out.println("""
                ===== Main Menu =====
                1- Books Menu
                2- Exit
                =====================""");
        System.out.print("Enter your choice: ");
    }

    private static void addBook() {

        System.out.println("Enter Book Id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Book newBook = new Book(bookId, title, author, publisher, price);
        bookList.add(newBook);
        System.out.println("Book added successfully");
    }


    private static void editBook() {
        System.out.print("Enter the Book ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToEdit = null;
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                bookToEdit = book;
                break;
            }
        }

        if (bookToEdit == null) {
            System.out.println("Book not found");
            return;
        }

        System.out.print("Enter new Title: ");
        String title = scanner.nextLine();
        if (!title.isEmpty()){
            bookToEdit.setTitle(title);
        }

        System.out.print("Enter new Author: ");
        String author = scanner.nextLine();
        if (!author.isEmpty()) {
            bookToEdit.setAuthor(author);
        }

        System.out.print("Enter new Publisher: ");
        String publisher = scanner.nextLine();
        if (!publisher.isEmpty()) {
            bookToEdit.setPublisher(publisher);
        }

        System.out.print("Enter new Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        if (price >= 0) {
            bookToEdit.setPrice(price);
        }

        System.out.println("Book updated successfully");
    }

    private static void removeBook() {
        System.out.print("Enter the Book ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToRemove = null;
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            bookList.remove(bookToRemove);
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found");
        }
    }

    private static void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the list");
        } else {
            System.out.println("\n List of Books ");
            for (Book book : bookList){
                System.out.println(book);
            }
        }
    }
}
