package MakerPlanQuestions;

import java.util.Scanner;

public class Recursion {

    static int moveCount = 0;

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }

        return binarySearch(arr, mid + 1, high, key);
    }

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return number % 10 + sumOfDigits(number / 10);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    public static boolean checkBalance(String str, int index, int count) {
        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        char ch = str.charAt(index);

        if (ch == '(') {
            return checkBalance(str, index + 1, count + 1);
        } else if (ch == ')') {
            return checkBalance(str, index + 1, count - 1);
        }

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves: " + moveCount);

        int[] prices = {100, 200, 300, 400, 500, 600, 700};

        System.out.print("Enter price to search: ");
        int key = sc.nextInt();

        int index = binarySearch(prices, 0, prices.length - 1, key);
        System.out.println("Binary Search Result Index: " + index);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Sum of Digits: " + sumOfDigits(number));

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Reversed String: " + reverseString(text));

        System.out.print("Enter parentheses expression: ");
        String expression = sc.nextLine();

        System.out.println("Balanced Parentheses: " + isBalanced(expression));

        sc.close();
    }
}