package GcrCodeBase.Generics.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApplication {

    public static void main(String[] args) {
        Storage<Electronics> techSection = new Storage<>();
        Storage<Groceries> foodSection = new Storage<>();
        Storage<Furniture> homeSection = new Storage<>();

        System.out.println("--- Receiving Incoming Stock ---");
        techSection.addItem(new Electronics("4K Smart TV", 18.2, 24));
        techSection.addItem(new Electronics("Wireless Router", 0.6, 12));

        foodSection.addItem(new Groceries("Whole Wheat Bread", 0.4, "2026-07-15"));
        foodSection.addItem(new Groceries("Greek Yogurt", 0.5, "2026-07-22"));

        homeSection.addItem(new Furniture("Oak Dining Table", 45.0, "Solid Wood"));

        System.out.println("\n--- Displaying Inventory Segments via Wildcard Method ---");
        Storage.displayAllItems(techSection.getItems());
        Storage.displayAllItems(foodSection.getItems());
        Storage.displayAllItems(homeSection.getItems());

        System.out.println("\n--- Displaying Consolidated Inventory Master List ---");
        List<WarehouseItem> masterInventoryList = new ArrayList<>();
        masterInventoryList.addAll(techSection.getItems());
        masterInventoryList.addAll(foodSection.getItems());
        masterInventoryList.addAll(homeSection.getItems());

        Storage.displayAllItems(masterInventoryList);
    }
}