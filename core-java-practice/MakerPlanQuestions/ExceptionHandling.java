package MakerPlanQuestions;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    public static double calculateAverageBill(double totalBill, int numberOfItems) {
        return totalBill / numberOfItems;
    }

    public static void processPayment(double billAmount, double amountPaid)
            throws InsufficientFundsException {

        if (amountPaid < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds. Need "
                            + (billAmount - amountPaid) + " more.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] patients = {"John", "Alice", "Bob", "David", "Emma"};

        try {
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items in bill: ");
            int numberOfItems = Integer.parseInt(sc.nextLine());

            double averageBill = calculateAverageBill(totalBill, numberOfItems);
            System.out.println("Average Bill Per Item: " + averageBill);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Number of items must be greater than 0.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Patient index must be a valid integer.");
        }

        try {
            System.out.print("Enter bill amount: ");
            double billAmount = Double.parseDouble(sc.nextLine());

            System.out.print("Enter amount paid: ");
            double amountPaid = Double.parseDouble(sc.nextLine());

            processPayment(billAmount, amountPaid);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid payment amount.");
        }

        sc.close();
    }
}