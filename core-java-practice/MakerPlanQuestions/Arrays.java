package MakerPlanQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class Arrays {

    public static int findMax(int[] stock) {
        int max = stock[0];
        for (int item : stock) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public static int findMin(int[] stock) {
        int min = stock[0];
        for (int item : stock) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public static int findTotalStock(int[] stock) {
        int total = 0;
        for (int item : stock) {
            total += item;
        }
        return total;
    }

    public static boolean hasDuplicates(int[] stock) {
        HashSet<Integer> set = new HashSet<>();

        for (int item : stock) {
            if (!set.add(item)) {
                return true;
            }
        }
        return false;
    }

    public static void rotateArray(int[] stock, int k) {
        int n = stock.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = stock[i];
        }

        for (int i = 0; i < n; i++) {
            stock[i] = temp[i];
        }
    }

    public static int[][] transposeMatrix(int[][] shelf) {
        int rows = shelf.length;
        int cols = shelf[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        return transpose;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stock = {120, 85, 150, 85, 200, 175};

        System.out.println("Maximum Stock: " + findMax(stock));
        System.out.println("Minimum Stock: " + findMin(stock));
        System.out.println("Total Stock: " + findTotalStock(stock));
        System.out.println("Duplicates Present: " + hasDuplicates(stock));

        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();

        rotateArray(stock, k);

        System.out.print("Rotated Stock Array: ");
        printArray(stock);

        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Shelf Grid:");
        printMatrix(shelf);

        int[][] transposedShelf = transposeMatrix(shelf);

        System.out.println("Transposed Shelf Grid:");
        printMatrix(transposedShelf);

        sc.close();
    }
}