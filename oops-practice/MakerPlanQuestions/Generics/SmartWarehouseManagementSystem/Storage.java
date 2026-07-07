package GcrCodeBase.Generics.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("SUCCESS: Placed " + item.getName() + " into designated storage area.");
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayAllItems(List<? extends WarehouseItem> itemList) {
        System.out.println("\n--- Warehouse Storage Inventory ---");
        if (itemList.isEmpty()) {
            System.out.println("No items found in this section.");
        } else {
            for (WarehouseItem item : itemList) {
                System.out.println(item);
            }
        }
        System.out.println("-----------------------------------");
    }
}