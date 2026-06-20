package gcrCodeBase.Strings.Level1;

import java.util.Scanner;

public class StringComparison {

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

        String str1 = sc.next();
        String str2 = sc.next();

        boolean charAtResult = compareStrings(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Using charAt(): " + charAtResult);
        System.out.println("Using equals(): " + equalsResult);
        System.out.println("Results are same: " + (charAtResult == equalsResult));

        sc.close();
    }
}