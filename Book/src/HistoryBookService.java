import java.util.ArrayList;
import java.util.Scanner;

public class HistoryBookService {
    static ArrayList<HistoryBook> historyBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input method to get new HistoryBook data
    public static HistoryBook addInput() {
        HistoryBook historyBook = new HistoryBook();

        System.out.print("Enter Era: ");
        String era = scanner.nextLine();
        historyBook.setEra(era);

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        historyBook.setAuthor(author);

        System.out.print("Does it contain maps? (true/false): ");
        boolean containsMaps = scanner.nextBoolean();
        scanner.nextLine();
        historyBook.setContainsMaps(containsMaps);

        return historyBook;
    }

    // Save method to add HistoryBook to the list
    public static void save(HistoryBook historyBook) {
        historyBookList.add(historyBook);
        System.out.println("HistoryBook added successfully!");
    }

    public static void addHistoryBook() {
        HistoryBook newBook = addInput();
        save(newBook);
    }

    // Input method to edit an existing HistoryBook
    public static void editInput(HistoryBook book) {
        System.out.print("Enter new Era (leave blank to keep '" + book.getEra() + "'): ");
        String era = scanner.nextLine();
        if (!era.isEmpty()) {
            book.setEra(era);
        }

        System.out.print("Enter new Author (leave blank to keep '" + book.getAuthor() + "'): ");
        String author = scanner.nextLine();
        if (!author.isEmpty()) {
            book.setAuthor(author);
        }

        System.out.print("Change 'contains maps'? (true/false) (current: " + book.isContainsMaps() + "): ");
        String mapsInput = scanner.nextLine();
        if (!mapsInput.isEmpty()) {
            boolean newContainsMaps = Boolean.parseBoolean(mapsInput);
            book.setContainsMaps(newContainsMaps);
        }
    }

    // Edit method to select HistoryBook and edit
    public static void editHistoryBook() {
        displayAllHistoryBooks();
        if (historyBookList.isEmpty())
            return;

        System.out.print("Enter index of HistoryBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= historyBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        HistoryBook book = historyBookList.get(index);
        editInput(book);
        System.out.println("HistoryBook updated successfully!");
    }

    // Remove method
    public static void removeHistoryBook() {
        displayAllHistoryBooks();
        if (historyBookList.isEmpty())
            return;

        System.out.print("Enter index of HistoryBook to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= historyBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        historyBookList.remove(index);
        System.out.println("HistoryBook removed successfully!");
    }

    // Display method
    public static void displayAllHistoryBooks() {
        if (historyBookList.isEmpty()) {
            System.out.println("No HistoryBooks in the list.");
        } else {
            System.out.println("\nList of HistoryBooks:");
            for (int i = 0; i < historyBookList.size(); i++) {
                HistoryBook book = historyBookList.get(i);
                System.out.println("[" + i + "] Era: " + book.getEra() + ", Author: " + book.getAuthor() + ", Contains Maps: " + book.isContainsMaps());
            }
        }
    }
}
