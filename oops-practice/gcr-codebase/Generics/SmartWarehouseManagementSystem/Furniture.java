package GcrCodeBase.Generics.SmartWarehouseManagementSystem;

public class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String name, double weight, String material) {
        super(name, weight);
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " [Type: Furniture, Material: " + material + "]";
    }
}