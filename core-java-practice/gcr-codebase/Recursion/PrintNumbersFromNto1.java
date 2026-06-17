package gcrCodeBase.Recursion;

public class PrintNumbersFromNto1 {
    static void  printNumbersFromNto1(int n)
    {
        if (n==0) {
            return;
        }
        System.out.print(n + " ");
        printNumbersFromNto1(n-1);
    }

    public static void main(String[] args) {
        int N = 20;
        printNumbersFromNto1(N);
    }

}
