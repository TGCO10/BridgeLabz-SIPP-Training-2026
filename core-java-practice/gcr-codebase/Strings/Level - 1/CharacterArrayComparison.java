package gcrCodeBase.Strings.Level1;

import java.util.Scanner;

public class CharacterArrayComparison {

    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] userDefinedArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        System.out.print("User-defined array: ");
        for (char ch : userDefinedArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Built-in array: ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
}