import java.util.ArrayList;
import java.util.Scanner;

public class BookDriver {
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
                        BookService.addBook();
                    } else if (bookChoice == 2) {
                        BookService.editBook();
                    } else if (bookChoice == 3) {
                        BookService.removeBook();
                    } else if (bookChoice == 4) {
                        BookService.displayAllBooks();
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
}
