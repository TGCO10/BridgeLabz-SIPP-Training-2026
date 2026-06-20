package gcrCodeBase.ControlFlow.level2;

import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + " are:");

            int counter = 1;

            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}