package gcrCodeBase.Methods.Level3;

import java.util.Random;

public class FootballTeamHeights {

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nMean Height: " + findMeanHeight(heights) + " cm");
        System.out.println("Shortest Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(heights) + " cm");
    }
}