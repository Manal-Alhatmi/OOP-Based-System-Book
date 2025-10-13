import java.util.ArrayList;
import java.util.Scanner;

public class SocialHistoryBookService {
    static ArrayList<SocialHistoryBook> socialHistoryBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input collection method for adding new SocialHistoryBook
    public static SocialHistoryBook addInput() {
        System.out.print("Enter Focus Population: ");
        String focusPopulation = scanner.nextLine();

        System.out.print("Enter Era of Study: ");
        String eraOfStudy = scanner.nextLine();

        System.out.print("Enter Cultural Artifacts Discussed: ");
        String culturalArtifactsDiscussed = scanner.nextLine();

        return new SocialHistoryBook(focusPopulation, eraOfStudy, culturalArtifactsDiscussed);
    }

    // Save method to add SocialHistoryBook to the list
    public static void save(SocialHistoryBook book) {
        socialHistoryBookList.add(book);
        System.out.println("SocialHistoryBook added successfully!");
    }

    public static void editInput(SocialHistoryBook book) {
        System.out.print("Enter new Focus Population (leave blank to keep '" + book.getFocusPopulation() + "'): ");
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            book.setFocusPopulation(input);
        }

        System.out.print("Enter new Era of Study (leave blank to keep '" + book.getEraOfStudy() + "'): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) {
            book.setEraOfStudy(input);
        }

        System.out.print("Enter new Cultural Artifacts Discussed (leave blank to keep '" + book.getCulturalArtifactsDiscussed() + "'): ");
        input = scanner.nextLine();
        if (!input.isEmpty()) {
            book.setCulturalArtifactsDiscussed(input);
        }
    }

    public static void editSocialHistoryBook() {
        displayAllSocialHistoryBooks();
        if (socialHistoryBookList.isEmpty())
            return;

        System.out.print("Enter index of SocialHistoryBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= socialHistoryBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        SocialHistoryBook book = socialHistoryBookList.get(index);
        editInput(book);

        System.out.println("SocialHistoryBook updated successfully!");
    }

    // Remove method by index
    public static void removeSocialHistoryBook() {
        displayAllSocialHistoryBooks();
        if (socialHistoryBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= socialHistoryBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        socialHistoryBookList.remove(index);
        System.out.println("SocialHistoryBook removed successfully!");
    }

    // Display all SocialHistoryBooks
    public static void displayAllSocialHistoryBooks() {
        if (socialHistoryBookList.isEmpty()) {
            System.out.println("No SocialHistoryBooks found.");
        } else {
            System.out.println("\nList of SocialHistoryBooks:");
            for (int i = 0; i < socialHistoryBookList.size(); i++) {
                System.out.println("[" + i + "] " + socialHistoryBookList.get(i));
            }
        }
    }
}
