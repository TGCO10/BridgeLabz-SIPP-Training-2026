package gcrCodeBase.Strings.Level2;

import java.util.Scanner;

public class SplitTextComparison {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    public static String[] splitText(String text) {
        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        words[wordCount - 1] = text.substring(start);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("Words using user-defined method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        System.out.println("Words using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
}