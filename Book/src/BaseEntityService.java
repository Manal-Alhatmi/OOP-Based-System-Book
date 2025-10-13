import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BaseEntityService {
    static ArrayList<BaseEntity> baseEntitiesList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static BaseEntity addInput() {
        BaseEntity newBaseEntity = new BaseEntity();

        System.out.print("Enter BaseEntity Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id < 0 || checkIfBookIdExists(id)) {
            System.out.println("Invalid or duplicate ID. Operation cancelled.");
            return null;
        }

        newBaseEntity.setId(id);
        String now = new Date().toString();
        newBaseEntity.setCreatedDate(now);
        newBaseEntity.setUpdatedDate(now);

        return newBaseEntity;
    }

    public static void save(BaseEntity baseEntity) {
        if (baseEntity != null) {
            baseEntitiesList.add(baseEntity);
            System.out.println("Base Entity added successfully");
        } else {
            System.out.println("Base Entity not added due to invalid input.");
        }
    }

    public static void addBaseEntity() {
        BaseEntity baseEntity = addInput();
        save(baseEntity);
    }

    public static void editBaseEntity() {
        System.out.print("Enter BaseEntity Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        BaseEntity baseEntityToEdit = null;
        for (BaseEntity baseEntity : baseEntitiesList) {
            if (baseEntity.getId().equals(id)) {
                baseEntityToEdit = baseEntity;
                break;
            }
        }
        if (baseEntityToEdit == null) {
            System.out.println("Base Entity not found");
            return;
        }

        System.out.print("Enter Created Date (leave blank to keep '" + baseEntityToEdit.getCreatedDate() + "'): ");
        String createdDate = scanner.nextLine();
        if (!createdDate.isEmpty()) {
            baseEntityToEdit.setCreatedDate(createdDate);
        }

        System.out.print("Enter Updated Date (leave blank to keep '" + baseEntityToEdit.getUpdatedDate() + "'): ");
        String updatedDate = scanner.nextLine();
        if (!updatedDate.isEmpty()) {
            baseEntityToEdit.setUpdatedDate(updatedDate);
        }
        System.out.println("Base Entity updated successfully");
    }

    public static void removeBaseEntity() {
        System.out.print("Enter Base Entity Id to Remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        BaseEntity baseEntityToRemove = null;
        for (BaseEntity baseEntity : baseEntitiesList) {
            if (baseEntity.getId().equals(id)) {
                baseEntityToRemove = baseEntity;
                break;
            }
        }
        if (baseEntityToRemove != null) {
            baseEntitiesList.remove(baseEntityToRemove);
            System.out.println("Base Entity removed successfully");
        } else {
            System.out.println("Base Entity not found");
        }
    }

    public static void displayAllBaseEntity() {
        if (baseEntitiesList.isEmpty()) {
            System.out.println("No base entity in the list");
        } else {
            System.out.println("\nList of Base Entities:");
            for (BaseEntity baseEntity : baseEntitiesList) {
                System.out.println(baseEntity);
            }
        }
    }

    public static boolean checkIfBookIdExists(int idToCheck) {
        for (BaseEntity baseEntity : baseEntitiesList) {
            if (baseEntity.getId() == idToCheck) {
                return true;
            }
        }
        return false;
    }
}
