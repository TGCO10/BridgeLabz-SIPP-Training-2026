package gcrCodebase.Hashing;

import java.util.*;

public class DuplicateToken {
    public static boolean hasDuplicateToken(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        for (String token : tokens) {
            if (!set.add(token))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"A12","B45","C67","A12"};
        System.out.println(hasDuplicateToken(tokens));
    }
}