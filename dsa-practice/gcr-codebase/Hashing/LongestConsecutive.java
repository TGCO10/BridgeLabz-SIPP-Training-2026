package gcrCodebase.Hashing;

import java.util.*;

public class LongestConsecutive {
    public static int longest(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
            set.add(num);
        int longest=0;
        for(int num:set){

            if(!set.contains(num-1)){
                int current=num;
                int length=1;

                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }

    public static void main(String args[]){
        int arr[]={100,4,200,1,3,2};
        System.out.println(longest(arr));
    }
}