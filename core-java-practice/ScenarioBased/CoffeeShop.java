package ScenarioBased;

import java.util.Scanner;

public class CoffeeShop {
    static String CoffeeType;
    int Quantity;

    public double calculatePrice(double price) {
        double bill = price*Quantity;
        double gst = price*0.18;
        double finalBill = bill + gst;
        return finalBill;
    }

    public void generateBill(double bill) {
        System.out.println("COFFEE TYPE-> " + CoffeeType);
        System.out.println("Quantity-> " + Quantity);
        System.out.println("BILL AMOUNT-> " + bill);
    }

    public static void main(String[] args) {
        System.out.println("Choose Coffee Type or Exit");
        System.out.println("1.Cappaccino:-150\n2.latte:-200\n3.Esprecoo:-275");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        CoffeeShop coffee = new CoffeeShop();
        switch (choice) {
            case 1:
                coffee.generateBill(coffee.calculatePrice(150));
                CoffeeType = "Cappaccino";
                break;

            case 2:
                coffee.generateBill(coffee.calculatePrice(200));
                CoffeeType = "latte";
                break;

            case 3:
                coffee.generateBill(coffee.calculatePrice(275));
                CoffeeType = "Esprecoo";
                break;
        }
    }
}
