import java.util.ArrayList;
import java.util.Scanner;

public class DesignBookService {
    static ArrayList<DesignBook> designBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input method to get data for a new DesignBook
    public static DesignBook addInput() {
        DesignBook designBook = new DesignBook();

        System.out.print("Enter Design Field: ");
        String field = scanner.nextLine();
        designBook.setDesignField(field);

        System.out.print("Includes Templates? (true/false): ");
        boolean includesTemplates = scanner.nextBoolean();
        scanner.nextLine();
        designBook.setIncludesTemplates(includesTemplates);

        return designBook;
    }

    public static void save(DesignBook designBook) {
        designBookList.add(designBook);
        System.out.println("DesignBook added successfully!");
    }

    public static void addDesignBook() {
        DesignBook newBook = addInput();
        save(newBook);
    }

    // Input method for editing an existing DesignBook
    public static void editInput(DesignBook book) {
        System.out.print("Enter new Design Field (leave blank to keep '" + book.getDesignField() + "'): ");
        String field = scanner.nextLine();
        if (!field.isEmpty()) {
            book.setDesignField(field);
        }

        System.out.print("Change includes templates? (true/false) (current: " + book.isIncludesTemplates() + "): ");
        String includesInput = scanner.nextLine();
        if (!includesInput.isEmpty()) {
            boolean newIncludes = Boolean.parseBoolean(includesInput);
            book.setIncludesTemplates(newIncludes);
        }
    }


    public static void editDesignBook() {
        displayAllDesignBooks();
        if (designBookList.isEmpty())
            return;

        System.out.print("Enter index of DesignBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= designBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        DesignBook book = designBookList.get(index);
        editInput(book);
        System.out.println("DesignBook updated successfully!");
    }

    // Remove method
    public static void removeDesignBook() {
        displayAllDesignBooks();
        if (designBookList.isEmpty())
            return;

        System.out.print("Enter index of DesignBook to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= designBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        designBookList.remove(index);

        System.out.println("DesignBook removed successfully!");
    }

    // Display method
    public static void displayAllDesignBooks() {
        if (designBookList.isEmpty()) {
            System.out.println("No DesignBooks in the list.");
        } else {
            System.out.println("\nList of DesignBooks:");
            for (int i = 0; i < designBookList.size(); i++) {
                DesignBook book = designBookList.get(i);
                System.out.println("[" + i + "] Design Field: " + book.getDesignField() + " Includes Templates: " + book.isIncludesTemplates());
            }
        }
    }
}
