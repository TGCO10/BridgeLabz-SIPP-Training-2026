package MakerPlan.TransportCompany;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double FuelCost(double km) {
        return km * 3;
    }
}
