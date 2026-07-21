package gcrCodebase.Stack;

import java.util.*;

public class StockSpan {
    static int[] span(int arr[]) {
        int n = arr.length;
        int span[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                    arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();
            stack.push(i);
        }
        return span;
    }

    public static void main(String args[]) {
        int arr[] = {100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(span(arr)));
    }
}