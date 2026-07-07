package GcrCodeBase.Generics.SmartWarehouseManagementSystem;

public class Groceries extends WarehouseItem {

    private String expiryDate;

    public Groceries(String name, double weight, String expiryDate) {
        super(name, weight);
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return super.toString() + " [Type: Groceries, Expiry: " + expiryDate + "]";
    }
}