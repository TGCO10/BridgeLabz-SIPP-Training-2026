package gcrCodeBase.Strings.Level2;

import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}