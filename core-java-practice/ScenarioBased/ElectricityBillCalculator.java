package ScenarioBased;

import java.util.Scanner;

public class ElectricityBillCalculator {
    double Units;
    public double electricityBillCalculator(double units){
        double amount = (units<=50)?5:(units<=100)?10:(units<=200)?15:(units<=300)?20:30;
        return amount;
    }

    public void generateBill(double units, double amount){
        System.out.println("-------------------------------------------");
        System.out.println("Welcome to Electricity Board");
        System.out.println("Total Units Consumed: " + units);
        System.out.println("Total Amount to be Paid: " + amount);
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        ElectricityBillCalculator elec = new ElectricityBillCalculator();
        Scanner scanner = new Scanner(System.in);
        double amount = elec.electricityBillCalculator(elec.Units=scanner.nextDouble());
        double totalAmount = elec.Units*amount;
        elec.generateBill(elec.Units, totalAmount);
    }
}
