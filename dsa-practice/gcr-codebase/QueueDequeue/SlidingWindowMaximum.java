package gcrCodebase.QueueDequeue;

import java.util.*;

public class SlidingWindowMaximum {
    static int[] maxWindow(int arr[], int k) {
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();
            while (!dq.isEmpty() &&
                    arr[dq.peekLast()] <= arr[i])
                dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1)
                ans[i - k + 1] = arr[dq.peekFirst()];
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxWindow(arr,3)));
    }
}