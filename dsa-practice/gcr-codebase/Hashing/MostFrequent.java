package gcrCodebase.Hashing;

import java.util.*;

public class MostFrequent {
    public static int mostFrequent(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int answer = arr[0];
        int maxCount = 0;

        for(int num : arr){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);

            if(count > maxCount){
                maxCount = count;
                answer = num;
            }
        }
        return answer;
    }

    public static void main(String args[]){
        int arr[]={500,404,500,200,404,500};
        System.out.println(mostFrequent(arr));
    }
}