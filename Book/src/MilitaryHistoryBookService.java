import java.util.ArrayList;
import java.util.Scanner;

public class MilitaryHistoryBookService {
    static ArrayList<MilitaryHistoryBook> militaryHistoryBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input collection method for adding a new MilitaryHistoryBook
    public static MilitaryHistoryBook addInput() {
        MilitaryHistoryBook newBook = new MilitaryHistoryBook("", "", "");

        System.out.print("Enter Conflict Focus: ");
        newBook.setConflictFocus(scanner.nextLine());

        System.out.print("Enter Battle Analysis Section: ");
        newBook.setBattleAnalysisSection(scanner.nextLine());

        System.out.print("Enter Strategic Maps: ");
        newBook.setStrategicMaps(scanner.nextLine());

        return newBook;
    }

    // Save method to add the book to list
    public static void save(MilitaryHistoryBook book) {
        militaryHistoryBookList.add(book);
        System.out.println("MilitaryHistoryBook added successfully!");
    }

    // Input collection for editing existing book
    public static void editInput(MilitaryHistoryBook book) {
        System.out.print("Enter new Conflict Focus (leave blank to keep '" + book.getConflictFocus() + "'): ");
        String input = scanner.nextLine();
        if (!input.isEmpty()) book.setConflictFocus(input);

        System.out.print("Enter new Battle Analysis Section (leave blank to keep '" + book.getBattleAnalysisSection() + "'): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) book.setBattleAnalysisSection(input);

        System.out.print("Enter new Strategic Maps (leave blank to keep '" + book.getStrategicMaps() + "'): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) book.setStrategicMaps(input);
    }


    public static void editMilitaryHistoryBook() {
        displayAllMilitaryHistoryBooks();
        if (militaryHistoryBookList.isEmpty())
            return;

        System.out.print("Enter index of MilitaryHistoryBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= militaryHistoryBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        MilitaryHistoryBook book = militaryHistoryBookList.get(index);
        editInput(book);

        System.out.println("MilitaryHistoryBook updated successfully!");
    }

    public static void removeMilitaryHistoryBook() {
        displayAllMilitaryHistoryBooks();
        if (militaryHistoryBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= militaryHistoryBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        militaryHistoryBookList.remove(index);
        System.out.println("MilitaryHistoryBook removed successfully!");
    }

    public static void displayAllMilitaryHistoryBooks() {
        if (militaryHistoryBookList.isEmpty()) {
            System.out.println("No MilitaryHistoryBooks found.");
        } else {
            System.out.println("\nList of MilitaryHistoryBooks:");
            for (int i = 0; i < militaryHistoryBookList.size(); i++) {
                System.out.println("[" + i + "] " + militaryHistoryBookList.get(i));
            }
        }
    }
}
