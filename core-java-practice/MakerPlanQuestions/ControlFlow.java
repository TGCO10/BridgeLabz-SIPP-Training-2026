package MakerPlanQuestions;

import java.util.Scanner;

public class ControlFlow {

    public static double calculateTax(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }

    public static String getTaxBracket(double income) {
        if (income < 10000) {
            return "5% Tax Bracket";
        } else if (income <= 50000) {
            return "15% Tax Bracket";
        } else {
            return "30% Tax Bracket";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTaxCollected = 0;

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();

            double tax = calculateTax(incomes[i]);
            totalTaxCollected += tax;

            System.out.println("Tax Bracket: " + getTaxBracket(incomes[i]));
            System.out.println("Tax Amount: " + tax);
            System.out.println();
        }

        System.out.println("Total Tax Collected = " + totalTaxCollected);

        sc.close();
    }
}