import java.util.ArrayList;
import java.util.Scanner;

public class CookBookService {
    static ArrayList<CookBook> cookBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static void addCookBook() {
        System.out.print("Enter Cuisine Type: ");
        String cuisineType = scanner.nextLine();

        System.out.print("Enter Number of Recipes: ");
        int numberOfRecipes = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Does it have nutritional info? (true/false): ");
        boolean hasNutritionalInfo = scanner.nextBoolean();
        scanner.nextLine();

        CookBook newCookBook = new CookBook(cuisineType, numberOfRecipes, hasNutritionalInfo);
        cookBookList.add(newCookBook);
        System.out.println("CookBook added successfully!");
    }

    static void editCookBook() {
        displayAllCookBooks();
        if (cookBookList.isEmpty()) return;

        System.out.print("Enter index of CookBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= cookBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        CookBook cb = cookBookList.get(index);

        System.out.print("Enter new Cuisine Type (leave blank to keep '" + cb.getCuisineType() + "'): ");
        String cuisineType = scanner.nextLine();
        if (!cuisineType.isEmpty()) {
            cb.setCuisineType(cuisineType);
        }

        System.out.print("Enter new Number of Recipes (current: " + cb.getNumberOfRecipes() + "): ");
        String numberInput = scanner.nextLine();
        if (!numberInput.isEmpty()) {
            int newNumber = Integer.parseInt(numberInput);
            cb.setNumberOfRecipes(newNumber);
        }

        System.out.print("Change nutritional info? (true/false) (current: " + cb.isHasNutritionalInfo() + "): ");
        String boolInput = scanner.nextLine();
        if (!boolInput.isEmpty()) {
            boolean newBool = Boolean.parseBoolean(boolInput);
            cb.setHasNutritionalInfo(newBool);
        }

        System.out.println("CookBook updated successfully!");
    }

    static void removeCookBook() {
        displayAllCookBooks();
        if (cookBookList.isEmpty()) return;

        System.out.print("Enter index of CookBook to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= cookBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        cookBookList.remove(index);
        System.out.println("CookBook removed successfully!");
    }

    static void displayAllCookBooks() {
        if (cookBookList.isEmpty()) {
            System.out.println("No CookBooks in the list.");
        } else {
            System.out.println("\nList of CookBooks:");
            for (int i = 0; i < cookBookList.size(); i++) {
                System.out.println("[" + i + "] " + cookBookList.get(i));
            }
        }
    }
}
