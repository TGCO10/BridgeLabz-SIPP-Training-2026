package GcrCodeBase.Generics.SmartWarehouseManagementSystem;

public abstract class WarehouseItem {

    private String name;
    private double weight;

    public WarehouseItem(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item: " + name + " (" + weight + " kg)";
    }
}