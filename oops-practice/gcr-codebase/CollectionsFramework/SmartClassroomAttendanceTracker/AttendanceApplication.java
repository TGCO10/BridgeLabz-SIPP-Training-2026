package GcrCodeBase.CollectionsFramework.SmartClassroomAttendanceTracker;

import java.util.Scanner;

public class AttendanceApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceTracker tracker = new AttendanceTracker();
        boolean running = true;

        System.out.println("Welcome to the Smart Classroom Attendance Tracker!");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance Records");
            System.out.println("3. Exit System");
            System.out.print("Enter choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Subject Name: ");
                    String subject = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String student = scanner.nextLine();
                    tracker.markAttendance(subject, student);
                    break;
                case 2:
                    tracker.displayAttendanceRecords();
                    break;
                case 3:
                    System.out.println("Shutting down attendance tracker. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
        scanner.close();
    }
}