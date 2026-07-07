package GcrCodeBase.CollectionsFramework.SmartParkingSlotManager;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingManager manager = new ParkingManager();
        boolean running = true;

        System.out.println("Welcome to the Smart Parking Slot Manager!");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display All Parked Vehicles");
            System.out.println("5. Exit System");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle registration number to ADD: ");
                    String addRegNo = scanner.nextLine();
                    manager.vehicleEnter(addRegNo);
                    break;
                case 2:
                    System.out.print("Enter vehicle registration number to REMOVE: ");
                    String removeRegNo = scanner.nextLine();
                    manager.vehicleExit(removeRegNo);
                    break;
                case 3:
                    System.out.print("Enter vehicle registration number to SEARCH: ");
                    String searchRegNo = scanner.nextLine();
                    manager.searchVehicle(searchRegNo);
                    break;
                case 4:
                    manager.displayParkedVehicles();
                    break;
                case 5:
                    System.out.println("Shutting down the system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}