package GcrCodeBase.CollectionsFramework.SmartParkingSlotManager;

import java.util.ArrayList;

public class ParkingManager {
    private ArrayList<String> parkedVehicles;

    public ParkingManager() {
        parkedVehicles = new ArrayList<>();
    }

    public void vehicleEnter(String regNo) {
        parkedVehicles.add(regNo.toUpperCase());
        System.out.println("SUCCESS: Vehicle [" + regNo.toUpperCase() + "] has been parked.");
    }

    public void vehicleExit(String regNo) {
        if (parkedVehicles.remove(regNo.toUpperCase())) {
            System.out.println("SUCCESS: Vehicle [" + regNo.toUpperCase() + "] has exited.");
        } else {
            System.out.println("ERROR: Vehicle [" + regNo.toUpperCase() + "] not found.");
        }
    }

    public void searchVehicle(String regNo) {
        if (parkedVehicles.contains(regNo.toUpperCase())) {
            System.out.println("STATUS: Vehicle [" + regNo.toUpperCase() + "] is currently parked.");
        } else {
            System.out.println("STATUS: Vehicle [" + regNo.toUpperCase() + "] is NOT found.");
        }
    }

    public void displayParkedVehicles() {
        System.out.println("\n--- Currently Parked Vehicles ---");
        if (parkedVehicles.isEmpty()) {
            System.out.println("The parking area is currently empty.");
        } else {
            for (int i = 0; i < parkedVehicles.size(); i++) {
                System.out.println((i + 1) + ". " + parkedVehicles.get(i));
            }
        }
        System.out.println("Total occupied parking slots: " + parkedVehicles.size());
        System.out.println("---------------------------------");
    }
}