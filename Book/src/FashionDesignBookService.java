import java.util.ArrayList;
import java.util.Scanner;

public class FashionDesignBookService {
    static ArrayList<FashionDesignBook> fashionDesignBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Gather input for new FashionDesignBook
    static FashionDesignBook addInput() {
        System.out.print("Enter Garment Type: ");
        String garmentType = scanner.nextLine();

        System.out.print("Enter Fabric Guide: ");
        String fabricGuide = scanner.nextLine();

        System.out.print("Enter Illustration Technique: ");
        String illustrationTechnique = scanner.nextLine();

        return new FashionDesignBook(garmentType, fabricGuide, illustrationTechnique);
    }

    // Save new FashionDesignBook
    static void save(FashionDesignBook book) {
        fashionDesignBookList.add(book);
        System.out.println("FashionDesignBook added successfully!");
    }

    static void addFashionDesignBook() {
        FashionDesignBook book = addInput();
        save(book);
    }

    // Edit input for existing book
    static void editInput(FashionDesignBook book) {
        System.out.print("Enter new Garment Type (leave blank to keep '" + book.getGarmentType() + "'): ");
        String garmentType = scanner.nextLine();
        if (!garmentType.isEmpty()) {
            book.setGarmentType(garmentType);
        }

        System.out.print("Enter new Fabric Guide (leave blank to keep '" + book.getFabricGuide() + "'): ");
        String fabricGuide = scanner.nextLine();
        if (!fabricGuide.isEmpty()) {
            book.setFabricGuide(fabricGuide);
        }

        System.out.print("Enter new Illustration Technique (leave blank to keep '" + book.getIllustrationTechnique() + "'): ");
        String illustrationTechnique = scanner.nextLine();
        if (!illustrationTechnique.isEmpty()) {
            book.setIllustrationTechnique(illustrationTechnique);
        }
    }

    // Edit existing book by index
    static void editFashionDesignBook() {
        displayAllFashionDesignBooks();
        if (fashionDesignBookList.isEmpty())
            return;

        System.out.print("Enter index of FashionDesignBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= fashionDesignBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        FashionDesignBook book = fashionDesignBookList.get(index);
        editInput(book);

        System.out.println("FashionDesignBook updated successfully!");
    }

    // Remove a book by index
    static void removeFashionDesignBook() {
        displayAllFashionDesignBooks();
        if (fashionDesignBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= fashionDesignBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        fashionDesignBookList.remove(index);
        System.out.println("FashionDesignBook removed successfully!");
    }

    // Display all books
    static void displayAllFashionDesignBooks() {
        if (fashionDesignBookList.isEmpty()) {
            System.out.println("No FashionDesignBooks found.");
        } else {
            System.out.println("\nList of FashionDesignBooks:");
            for (int i = 0; i < fashionDesignBookList.size(); i++) {
                System.out.println("[" + i + "] " + fashionDesignBookList.get(i));
            }
        }
    }
}
