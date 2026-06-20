package gcrCodeBase.Strings.Level2;

import java.util.Scanner;

public class WordLengthTable {

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

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        words[index] = text.substring(start);

        return words;
    }

    public static String[][] getWordAndLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordData = getWordAndLength(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < wordData.length; i++) {
            System.out.println(
                    wordData[i][0] + "\t" + Integer.parseInt(wordData[i][1])
            );
        }

        sc.close();
    }
}