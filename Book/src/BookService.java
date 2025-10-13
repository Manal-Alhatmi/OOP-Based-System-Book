import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    static ArrayList<Book> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input method for adding a new book
    public static Book addInput() {
        System.out.print("Enter Book Id: ");
        Integer bookId = scanner.nextInt();
        scanner.nextLine();

        if (bookId == null || bookId < 0 || checkIfBookIdExists(bookId)) {
            System.out.println("Invalid! Operation cancelled");
            return null;
        }

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        if (price < 0) {
            System.out.println("Price can't be negative. Operation cancelled");
            return null;
        }

        return new Book(bookId, title, author, publisher, price);
    }

    public static void save(Book book) {
        if (book != null) {
            bookList.add(book);
            System.out.println("Book added successfully");
        } else {
            System.out.println("Book not saved due to invalid input");
        }
    }


    public static void addBook() {
        Book newBook = addInput();
        save(newBook);
    }

    public static void editInput(Book bookToEdit) {
        System.out.print("Enter new Title (leave blank to keep '" + bookToEdit.getTitle() + "'): ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) {
            bookToEdit.setTitle(title);
        }

        System.out.print("Enter new Author (leave blank to keep '" + bookToEdit.getAuthor() + "'): ");
        String author = scanner.nextLine();
        if (!author.isEmpty()) {
            bookToEdit.setAuthor(author);
        }

        System.out.print("Enter new Publisher (leave blank to keep '" + bookToEdit.getPublisher() + "'): ");
        String publisher = scanner.nextLine();
        if (!publisher.isEmpty()) {
            bookToEdit.setPublisher(publisher);
        }

        System.out.print("Enter new Price (enter -1 to keep current price): ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        if (price >= 0) {
            bookToEdit.setPrice(price);
        } else if (price != -1) {
            System.out.println("Invalid price entered, price not changed");
        }
    }

    // Edit Book
    public static void editBook() {
        System.out.print("Enter the Book ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToEdit = null;
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                bookToEdit = book;
                break;
            }
        }

        if (bookToEdit == null) {
            System.out.println("Book not found");
            return;
        }

        editInput(bookToEdit);
        System.out.println("Book updated successfully");
    }

    // Remove method
    public static void removeBook() {
        System.out.print("Enter the Book ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Book bookToRemove = null;
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
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

    // Display all books
    public static void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the list");
        } else {
            System.out.println("\nList of Books:");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    // Check if Book ID exists
    public static boolean checkIfBookIdExists(int idToCheck) {
        for (Book book : bookList) {
            if (book.getId() == idToCheck) {
                return true;
            }
        }
        return false;
    }
}
