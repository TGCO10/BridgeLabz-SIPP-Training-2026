package MakerPlanQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Strings {

    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    public static boolean isPalindrome(String message) {
        String cleaned = message.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static int[] countVowelsAndConsonants(String message) {
        int vowels = 0;
        int consonants = 0;

        message = message.toLowerCase();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static char firstNonRepeatingCharacter(String text) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));
        System.out.println("Palindrome: " + isPalindrome(message));

        int[] counts = countVowelsAndConsonants(message);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        System.out.print("Enter first intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String intercept2 = sc.nextLine();

        System.out.println("Anagrams: " + areAnagrams(intercept1, intercept2));

        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        char result = firstNonRepeatingCharacter(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}