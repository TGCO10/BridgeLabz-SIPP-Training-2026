package GcrCodeBase.Generics.SmartWarehouseManagementSystem;

public class Electronics extends WarehouseItem {

    private int warrantyMonths;

    public Electronics(String name, double weight, int warrantyMonths) {
        super(name, weight);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return super.toString() + " [Type: Electronics, Warranty: " + warrantyMonths + " months]";
    }
}