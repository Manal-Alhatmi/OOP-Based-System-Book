import java.util.ArrayList;
import java.util.Scanner;

public class BakingCookBookService {
    static ArrayList<BakingCookBook> bakingCookBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static BakingCookBook addInput() {
        System.out.print("Enter Baking Technique: ");
        String bakingTechnique = scanner.nextLine();

        System.out.print("Enter Difficulty Level: ");
        String difficultyLevel = scanner.nextLine();

        System.out.print("Enter Yeast Type: ");
        String yeastType = scanner.nextLine();

        return new BakingCookBook(bakingTechnique, difficultyLevel, yeastType);
    }

    public static void save(BakingCookBook book) {
        bakingCookBookList.add(book);
        System.out.println("BakingCookBook added successfully!");
    }

    public static void addBakingCookBook() {
        BakingCookBook book = addInput();
        save(book);
    }

    // Input method to edit an existing BakingCookBook
    public static void editInput(BakingCookBook book) {
        System.out.print("Enter new Baking Technique (leave blank to keep '" + book.getBakingTechnique() + "'): ");
        String bakingTechnique = scanner.nextLine();
        if (!bakingTechnique.isEmpty()) {
            book.setBakingTechnique(bakingTechnique);
        }

        System.out.print("Enter new Difficulty Level (leave blank to keep '" + book.getDifficultyLevel() + "'): ");
        String difficultyLevel = scanner.nextLine();
        if (!difficultyLevel.isEmpty()) {
            book.setDifficultyLevel(difficultyLevel);
        }

        System.out.print("Enter new Yeast Type (leave blank to keep '" + book.getYeastType() + "'): ");
        String yeastType = scanner.nextLine();
        if (!yeastType.isEmpty()) {
            book.setYeastType(yeastType);
        }
    }

    public static void editBakingCookBook() {
        displayAllBakingCookBooks();
        if (bakingCookBookList.isEmpty())
            return;

        System.out.print("Enter index of BakingCookBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= bakingCookBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        BakingCookBook book = bakingCookBookList.get(index);
        editInput(book);
        System.out.println("BakingCookBook updated successfully!");
    }

    // Remove method
    public static void removeBakingCookBook() {
        displayAllBakingCookBooks();
        if (bakingCookBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= bakingCookBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        bakingCookBookList.remove(index);
        System.out.println("BakingCookBook removed successfully!");
    }

    public static void displayAllBakingCookBooks() {
        if (bakingCookBookList.isEmpty()) {
            System.out.println("No BakingCookBooks found.");
        } else {
            System.out.println("\nList of BakingCookBooks:");
            for (int i = 0; i < bakingCookBookList.size(); i++) {
                System.out.println("[" + i + "] " + bakingCookBookList.get(i));
            }
        }
    }
}
