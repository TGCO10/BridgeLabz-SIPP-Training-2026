package gcrCodebase.Sorting;

import java.util.*;

public class InsertionSort{
    public static void insertionSort(int arr[]) {
        int n=arr.length;

        for(int i=1;i<n;i++) {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int ids[]={104,102,101,109,106};
        insertionSort(ids);
    }
}