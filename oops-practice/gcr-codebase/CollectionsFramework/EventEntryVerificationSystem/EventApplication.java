package GcrCodeBase.CollectionsFramework.EventEntryVerificationSystem;

import java.util.Scanner;

public class EventApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationManager manager = new RegistrationManager();
        boolean running = true;

        System.out.println("Welcome to the Event Entry Verification System!");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Register Participant");
            System.out.println("2. Display All Unique Participants");
            System.out.println("3. Exit System");
            System.out.print("Enter choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter participant email ID: ");
                    String email = scanner.nextLine();
                    manager.registerParticipant(email);
                    break;
                case 2:
                    manager.displayParticipants();
                    break;
                case 3:
                    System.out.println("Shutting down registration system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
        scanner.close();
    }
}