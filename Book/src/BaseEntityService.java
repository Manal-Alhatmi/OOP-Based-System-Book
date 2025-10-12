import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BaseEntityService {
    static ArrayList<BaseEntity> baseEntitiesList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static void addBaseEntity() {
        BaseEntity newBaseEntities = new BaseEntity();
        System.out.println("Enter BaseEntity Id: ");
        Integer id = scanner.nextInt();
        while ( (id < 0) || checkIfBookIdExists(id)) {
            System.out.println("Input is not accepted, please enter another ID");
            id = scanner.nextInt();
        }
        newBaseEntities.setId(id);
        scanner.nextLine();
        newBaseEntities.setCreatedDate((new Date().toString()));
        newBaseEntities.setUpdatedDate((new Date().toString()));
        baseEntitiesList.add(newBaseEntities);

        baseEntitiesList.add(newBaseEntities);
        System.out.println("Base Entity added successfully");
    }


    public static void editBaseEntity() {
        System.out.println("Enter BaseEntity Id: ");
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

        System.out.println("Enter Created Date");
        String createdDate = scanner.nextLine();
        if (!createdDate.isEmpty()) {
            baseEntityToEdit.setCreatedDate(createdDate);
        }

        System.out.println("Enter Updated Date");
        String updatedDate = scanner.nextLine();
        if (!updatedDate.isEmpty()) {
            baseEntityToEdit.setUpdatedDate(updatedDate);
        }
        System.out.println("Base Entity updated successfully");
    }


        public static void removeBaseEntity() {
        System.out.println("Enter Base Entity Id to Remove: ");
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


    static void displayAllBaseEntity() {
        if (baseEntitiesList.isEmpty()) {
            System.out.println("No base entity in the list");
        } else {
            System.out.println("\n List of Base Entity ");
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
