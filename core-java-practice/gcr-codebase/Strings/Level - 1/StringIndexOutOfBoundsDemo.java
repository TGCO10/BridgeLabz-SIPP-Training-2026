package gcrCodeBase.Strings.Level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        // Call this method to generate the exception
        // generateException(text);

        // Call this method to handle the exception
        handleException(text);

        sc.close();
    }
}