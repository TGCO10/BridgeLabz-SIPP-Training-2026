package gcrCodeBase.Recursion;

public class GenerateAllPermutationsOfaString {

    static void permute(String str, int index) {
        if (index == str.length() - 1) {
            System.out.println(str);
            return;
        }

        for (int i = index; i < str.length(); i++) {
            str = swap(str, index, i);
            permute(str, index + 1);
            str = swap(str, index, i); // backtrack
        }
    }

    static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0);
    }
}
