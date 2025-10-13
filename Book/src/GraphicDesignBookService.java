import java.util.ArrayList;
import java.util.Scanner;

public class GraphicDesignBookService {
    static ArrayList<GraphicDesignBook> graphicDesignBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input gathering for adding new book
    static GraphicDesignBook addInput() {
        System.out.print("Enter Typography Focus: ");
        String typographyFocus = scanner.nextLine();

        System.out.print("Enter Color Theory Section: ");
        String colorTheorySection = scanner.nextLine();

        System.out.print("Enter Software Tutorials Included: ");
        String softwareTutorialsIncluded = scanner.nextLine();

        return new GraphicDesignBook(typographyFocus, colorTheorySection, softwareTutorialsIncluded);
    }

    // Save new book
    static void save(GraphicDesignBook book) {
        graphicDesignBookList.add(book);
        System.out.println("GraphicDesignBook added successfully!");
    }

    static void addGraphicDesignBook() {
        GraphicDesignBook book = addInput();
        save(book);
    }

    // Input gathering for editing existing book
    static void editInput(GraphicDesignBook book) {
        System.out.print("Enter new Typography Focus (leave blank to keep '" + book.getTypographyFocus() + "'): ");
        String typographyFocus = scanner.nextLine();
        if (!typographyFocus.isEmpty()) {
            book.setTypographyFocus(typographyFocus);
        }

        System.out.print("Enter new Color Theory Section (leave blank to keep '" + book.getColorTheorySection() + "'): ");
        String colorTheorySection = scanner.nextLine();
        if (!colorTheorySection.isEmpty()) {
            book.setColorTheorySection(colorTheorySection);
        }

        System.out.print("Enter new Software Tutorials Included (leave blank to keep '" + book.getSoftwareTutorialsIncluded() + "'): ");
        String softwareTutorialsIncluded = scanner.nextLine();
        if (!softwareTutorialsIncluded.isEmpty()) {
            book.setSoftwareTutorialsIncluded(softwareTutorialsIncluded);
        }
    }

    // Edit book by index
    static void editGraphicDesignBook() {
        displayAllGraphicDesignBooks();
        if (graphicDesignBookList.isEmpty())
            return;

        System.out.print("Enter index of GraphicDesignBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= graphicDesignBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        GraphicDesignBook book = graphicDesignBookList.get(index);
        editInput(book);

        System.out.println("GraphicDesignBook updated successfully!");
    }

    // Remove book by index
    static void removeGraphicDesignBook() {
        displayAllGraphicDesignBooks();
        if (graphicDesignBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= graphicDesignBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        graphicDesignBookList.remove(index);
        System.out.println("GraphicDesignBook removed successfully!");
    }

    // Display all books
    static void displayAllGraphicDesignBooks() {
        if (graphicDesignBookList.isEmpty()) {
            System.out.println("No GraphicDesignBooks found.");
        } else {
            System.out.println("\nList of GraphicDesignBooks:");
            for (int i = 0; i < graphicDesignBookList.size(); i++) {
                System.out.println("[" + i + "] " + graphicDesignBookList.get(i));
            }
        }
    }
}
