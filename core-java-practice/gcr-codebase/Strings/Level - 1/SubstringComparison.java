package gcrCodeBase.Strings.Level1;

import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean result = compareStrings(customSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }
}