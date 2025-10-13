import java.util.ArrayList;
import java.util.Scanner;

public class InteriorDesignBookService {
    static ArrayList<InteriorDesignBook> interiorDesignBookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Input gathering method for adding
    static InteriorDesignBook addInput() {
        System.out.print("Enter Design Style: ");
        String designStyle = scanner.nextLine();

        System.out.print("Enter Room Focus: ");
        String roomFocus = scanner.nextLine();

        System.out.print("Enter Material Palette: ");
        String materialPalette = scanner.nextLine();

        return new InteriorDesignBook(designStyle, roomFocus, materialPalette);
    }

    // Save method for adding
    static void save(InteriorDesignBook book) {
        interiorDesignBookList.add(book);
        System.out.println("InteriorDesignBook added successfully!");
    }

    // Wrapper method to add book
    static void addInteriorDesignBook() {
        InteriorDesignBook book = addInput();
        save(book);
    }

    // Input gathering for editing
    static void editInput(InteriorDesignBook book) {
        System.out.print("Enter new Design Style (leave blank to keep '" + book.getDesignStyle() + "'): ");
        String designStyle = scanner.nextLine();
        if (!designStyle.isEmpty()) {
            book.setDesignStyle(designStyle);
        }

        System.out.print("Enter new Room Focus (leave blank to keep '" + book.getRoomFocus() + "'): ");
        String roomFocus = scanner.nextLine();
        if (!roomFocus.isEmpty()) {
            book.setRoomFocus(roomFocus);
        }

        System.out.print("Enter new Material Palette (leave blank to keep '" + book.getMaterialPalette() + "'): ");
        String materialPalette = scanner.nextLine();
        if (!materialPalette.isEmpty()) {
            book.setMaterialPalette(materialPalette);
        }
    }

    // Edit book by index
    static void editInteriorDesignBook() {
        displayAllInteriorDesignBooks();
        if (interiorDesignBookList.isEmpty()) return;

        System.out.print("Enter index of InteriorDesignBook to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= interiorDesignBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        InteriorDesignBook book = interiorDesignBookList.get(index);
        editInput(book);

        System.out.println("InteriorDesignBook updated successfully!");
    }

    // Remove by index
    static void removeInteriorDesignBook() {
        displayAllInteriorDesignBooks();
        if (interiorDesignBookList.isEmpty())
            return;

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= interiorDesignBookList.size()) {
            System.out.println("Invalid index");
            return;
        }

        interiorDesignBookList.remove(index);
        System.out.println("InteriorDesignBook removed successfully!");
    }

    // Display all books
    static void displayAllInteriorDesignBooks() {
        if (interiorDesignBookList.isEmpty()) {
            System.out.println("No InteriorDesignBooks found.");
        } else {
            System.out.println("\nList of InteriorDesignBooks:");
            for (int i = 0; i < interiorDesignBookList.size(); i++) {
                System.out.println("[" + i + "] " + interiorDesignBookList.get(i));
            }
        }
    }
}
