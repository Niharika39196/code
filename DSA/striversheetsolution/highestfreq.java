//Highest Occurring Element in an Array

import java.util.*;

public class MostFrequentElement {
    public static int mostFrequent(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the element with max frequency (and smallest if tie)
        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFreq) {
                maxFreq = value;
                result = key;
            } else if (value == maxFreq) {
                result = Math.min(result, key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 4, 5, 5, 7, 4};
        System.out.println("Most frequent element: " + mostFrequent(nums));
        // Output: 4
    }
}
