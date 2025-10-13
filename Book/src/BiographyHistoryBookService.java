import java.util.ArrayList;
import java.util.Scanner;

public class BiographyHistoryBookService {
    static ArrayList<BiographyHistoryBook> biographyHistoryBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Collect input to create a new BiographyHistoryBook object
    static BiographyHistoryBook addInput() {
        System.out.print("Enter Subject Person: ");
        String subjectPerson = scanner.nextLine();

        System.out.print("Enter Historical Period: ");
        String historicalPeriod = scanner.nextLine();

        System.out.print("Enter Primary Source Excerpts: ");
        String primarySourceExcerpts = scanner.nextLine();

        return new BiographyHistoryBook(subjectPerson, historicalPeriod, primarySourceExcerpts);
    }

    // Save a BiographyHistoryBook to the list
    static void save(BiographyHistoryBook book) {
        biographyHistoryBookList.add(book);
        System.out.println("BiographyHistoryBook added successfully!");
    }

    // Collect inputs for editing an existing BiographyHistoryBook at a given index
    static void editInput(int index) {
        if (index < 0 || index >= biographyHistoryBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        BiographyHistoryBook book = biographyHistoryBookList.get(index);

        System.out.print("Enter new Subject Person (leave blank to keep '" + book.getSubjectPerson() + "'): ");
        String subjectPerson = scanner.nextLine();
        if (!subjectPerson.isEmpty()) {
            book.setSubjectPerson(subjectPerson);
        }

        System.out.print("Enter new Historical Period (leave blank to keep '" + book.getHistoricalPeriod() + "'): ");
        String historicalPeriod = scanner.nextLine();
        if (!historicalPeriod.isEmpty()) {
            book.setHistoricalPeriod(historicalPeriod);
        }

        System.out.print("Enter new Primary Source Excerpts (leave blank to keep '" + book.getPrimarySourceExcerpts() + "'): ");
        String primarySourceExcerpts = scanner.nextLine();
        if (!primarySourceExcerpts.isEmpty()) {
            book.setPrimarySourceExcerpts(primarySourceExcerpts);
        }

        System.out.println("BiographyHistoryBook updated successfully!");
    }
    static void remove(int index) {
        if (index < 0 || index >= biographyHistoryBookList.size()) {
            System.out.println("Invalid index");
            return;
        }
        biographyHistoryBookList.remove(index);
        System.out.println("BiographyHistoryBook removed successfully!");
    }

    static void displayAll() {
        if (biographyHistoryBookList.isEmpty()) {
            System.out.println("No BiographyHistoryBooks found.");
        } else {
            System.out.println("\nList of BiographyHistoryBooks:");
            for (int i = 0; i < biographyHistoryBookList.size(); i++) {
                System.out.println("[" + i + "] " + biographyHistoryBookList.get(i));
            }
        }
    }
}
