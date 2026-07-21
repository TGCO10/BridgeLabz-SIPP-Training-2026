package gcrCodebase.Stack;

import java.util.*;

public class NextGreater {
    static int[] nextGreater(int arr[]) {

        int n = arr.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {4,5,2,25};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}