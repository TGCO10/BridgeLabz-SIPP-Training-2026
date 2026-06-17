package gcrCodeBase.Recursion;

import java.util.Scanner;

public class ReverseStringUsingRecursion {
    static String reverseStringUsingRecursion(String s){
        if(s.isEmpty()) {
            return s;
        }
        return reverseStringUsingRecursion(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseStringUsingRecursion(s));
    }
}
