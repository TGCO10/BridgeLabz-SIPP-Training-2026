package gcrCodebase.Sorting;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++) {

            swapped=false;

            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }

            if(!swapped) {
                System.out.println("Already Sorted");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int marks[]={78,45,90,66,55};
        bubbleSort(marks);
    }
}