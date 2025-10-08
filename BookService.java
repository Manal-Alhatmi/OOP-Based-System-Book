import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    static ArrayList<Book> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static void addBook() {

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


    static void editBook() {
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

    static void removeBook() {
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

    static void displayAllBooks() {
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
