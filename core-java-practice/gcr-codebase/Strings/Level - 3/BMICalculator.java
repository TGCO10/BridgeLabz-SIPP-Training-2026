package gcrCodeBase.Strings.Level3;

import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] generateBMIReport(double[][] data) {
        String[][] report = new String[10][4];

        for (int i = 0; i < data.length; i++) {
            String[] bmiData = calculateBMI(data[i][0], data[i][1]);

            report[i][0] = String.valueOf(data[i][1]);
            report[i][1] = String.valueOf(data[i][0]);
            report[i][2] = bmiData[0];
            report[i][3] = bmiData[1];
        }

        return report;
    }

    public static void displayReport(String[][] report) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                            report[i][1] + "\t\t" +
                            report[i][2] + "\t" +
                            report[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        String[][] report = generateBMIReport(persons);

        displayReport(report);

        sc.close();
    }
}