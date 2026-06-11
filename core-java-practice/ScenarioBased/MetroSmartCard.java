package ScenarioBased;

import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        double balance = 100.00;
        while(balance>0) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("------------------------------------------------------");
            System.out.println("Enter Distance in KM or Type -1 to exit");
            double distance=scanner.nextDouble();

            if(distance == -1) {
                break;
            }

            //Fare Calc
            double fare = (distance<=5)?10:(distance<=10)?20:(distance<=20)?30:(distance<=30)?40:50;

            //Balance Calc
            if(balance >= fare) {
                balance -= fare;
                System.out.println("Travel permitted for distance " +  distance + " KM");
                System.out.println("Available Balance in your card is "+balance);
            } else {
                System.out.println("Insufficient fund, recharge to travel for the desired distance");
            }
            System.out.println("Welcome to DMRC");
            System.out.println("------------------------------------------------------");
        }
        System.out.println("Thank you for Travelling in DMRC.");
    }

}
