package MakerPlanQuestions;

import java.util.Scanner;

public class FunctionsAndMethods {
    public Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);;
        return result;
    }

    public int fibonacci(int n){
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci number is " + firstTerm + ", " + secondTerm);

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return firstTerm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FunctionsAndMethods f = new FunctionsAndMethods();
        while (true) {
            System.out.println("1. isPrime\n2. Factorial\n3. Fibonacci\n4. Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    int n = input.nextInt();
                    System.out.println(f.isPrime(n));
                    break;

                case 2:
                    n = input.nextInt();
                    System.out.println(f.factorial(n));
                    break;

                case 3:
                    n = input.nextInt();
                    f.fibonacci(n);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

