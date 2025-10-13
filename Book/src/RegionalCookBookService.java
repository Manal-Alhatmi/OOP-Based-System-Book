import java.util.ArrayList;
import java.util.Scanner;

public class RegionalCookBookService {
    static ArrayList<RegionalCookBook> regionalCookBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static RegionalCookBook addInput() {

        System.out.print("Enter Cuisine Region: ");
        String cuisineRegion = scanner.nextLine();

        System.out.print("Enter Cultural Context: ");
        String culturalContext = scanner.nextLine();

        System.out.print("Enter Ingredient Sourcing Guide: ");
        String sourcingGuide = scanner.nextLine();

        return new RegionalCookBook( cuisineRegion, culturalContext, sourcingGuide);
    }

    // Save method
    public static void save(RegionalCookBook book) {
        regionalCookBookList.add(book);
        System.out.println("RegionalCookBook added successfully!");
    }

    public static void addRegionalCookBook() {
        RegionalCookBook book = addInput();
        save(book);
    }

    // Input method for editing existing RegionalCookBook
    public static void editInput(RegionalCookBook book) {
        System.out.print("Enter new Cuisine Region (leave blank to keep '" + book.getCuisineRegion() + "'): ");
        String region = scanner.nextLine();
        if (!region.isEmpty()) book.setCuisineRegion(region);

        System.out.print("Enter new Cultural Context (leave blank to keep '" + book.getCulturalContext() + "'): ");
        String context = scanner.nextLine();
        if (!context.isEmpty()) book.setCulturalContext(context);

        System.out.print("Enter new Ingredient Sourcing Guide (leave blank to keep '" + book.getIngredientSourcingGuide() + "'): ");
        String sourcingGuide = scanner.nextLine();
        if (!sourcingGuide.isEmpty()) book.setIngredientSourcingGuide(sourcingGuide);
    }


    public static void editRegionalCookBook() {
        displayAllRegionalCookBooks();
        if (regionalCookBookList.isEmpty())
            return;

        System.out.print("Enter index to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= regionalCookBookList.size()) {
            System.out.println("Invalid index.");
            return;
        }

        RegionalCookBook book = regionalCookBookList.get(index);
        editInput(book);

        System.out.println("RegionalCookBook updated successfully!");
    }

    // Remove method
    public static void removeRegionalCookBook() {
        displayAllRegionalCookBooks();
        if (regionalCookBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= regionalCookBookList.size()) {
            System.out.println("Invalid index.");
            return;
        }

        regionalCookBookList.remove(index);
        System.out.println("RegionalCookBook removed successfully!");
    }

    // Display method
    public static void displayAllRegionalCookBooks() {
        if (regionalCookBookList.isEmpty()) {
            System.out.println("No RegionalCookBooks found.");
        } else {
            System.out.println("\nList of RegionalCookBooks:");
            for (int i = 0; i < regionalCookBookList.size(); i++) {
                System.out.println("[" + i + "] " + regionalCookBookList.get(i));
            }
        }
    }
}
