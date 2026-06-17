package gcrCodeBase.Recursion;
import java.util.*;

public class GenerateAllSubsetsOfAnArray {

    static void generateSubsets(int[] arr, int index, List<Integer> subset) {
        if (index == arr.length) {
            System.out.println(subset);
            return;
        }
        generateSubsets(arr, index + 1, subset);

        subset.add(arr[index]);
        generateSubsets(arr, index + 1, subset);

        subset.remove(subset.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}
