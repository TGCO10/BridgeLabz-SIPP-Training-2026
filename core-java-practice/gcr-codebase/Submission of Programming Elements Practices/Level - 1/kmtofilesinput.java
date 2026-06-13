package gcrCodeBase.ProgrammingElements.level_1;

import java.util.Scanner;

public class kmtofilesinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("Distance in miles is " + miles);

        input.close();
    }
}