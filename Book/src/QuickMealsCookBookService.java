import java.util.ArrayList;
import java.util.Scanner;

public class QuickMealsCookBookService {
    static ArrayList<QuickMealsCookBook> quickMealsCookBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Gather input and create new QuickMealsCookBook
    public static QuickMealsCookBook addInput() {

        System.out.print("Enter Max Preparation Time (in minutes): ");
        int maxPreparationTime = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Meal Type (e.g., Breakfast, Lunch): ");
        String mealType = scanner.nextLine();

        System.out.print("Enter Caloric Information (e.g., 500 kcal): ");
        String caloricInformation = scanner.nextLine();

        return new QuickMealsCookBook(maxPreparationTime, mealType, caloricInformation);
    }

    // Save the QuickMealsCookBook to the list
    public static void save(QuickMealsCookBook book) {
        quickMealsCookBookList.add(book);
        System.out.println("QuickMealsCookBook added successfully!");
    }

    // Convenience method to add
    public static void addQuickMealsCookBook() {
        QuickMealsCookBook book = addInput();
        save(book);
    }

    // Edit inputs for an existing QuickMealsCookBook
    public static void editInput(QuickMealsCookBook book) {

        System.out.print("Enter new Max Preparation Time (leave blank to keep '" + book.getMaxPreparationTime() + "'): ");
        String prepTimeInput = scanner.nextLine();
        if (!prepTimeInput.isEmpty()) {
            int prepTime = Integer.parseInt(prepTimeInput);
            book.setMaxPreparationTime(prepTime);
        }

        System.out.print("Enter new Meal Type (leave blank to keep '" + book.getMealType() + "'): ");
        String mealType = scanner.nextLine();
        if (!mealType.isEmpty()) {
            book.setMealType(mealType);
        }

        System.out.print("Enter new Caloric Information (leave blank to keep '" + book.getCaloricInformation() + "'): ");
        String calories = scanner.nextLine();
        if (!calories.isEmpty()) {
            book.setCaloricInformation(calories);
        }
    }

    // Edit an existing QuickMealsCookBook
    public static void editQuickMealsCookBook() {
        displayAllQuickMealsCookBooks();
        if (quickMealsCookBookList.isEmpty())
            return;

        System.out.print("Enter index of QuickMealsCookBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= quickMealsCookBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        QuickMealsCookBook book = quickMealsCookBookList.get(index);
        editInput(book);

        System.out.println("QuickMealsCookBook updated successfully!");
    }

    // Remove method
    public static void removeQuickMealsCookBook() {
        displayAllQuickMealsCookBooks();
        if (quickMealsCookBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= quickMealsCookBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        quickMealsCookBookList.remove(index);
        System.out.println("QuickMealsCookBook removed successfully!");
    }

    public static void displayAllQuickMealsCookBooks() {
        if (quickMealsCookBookList.isEmpty()) {
            System.out.println("No QuickMealsCookBooks found.");
        } else {
            System.out.println("\nList of QuickMealsCookBooks:");
            for (int i = 0; i < quickMealsCookBookList.size(); i++) {
                System.out.println("[" + i + "] " + quickMealsCookBookList.get(i));
            }
        }
    }
}
