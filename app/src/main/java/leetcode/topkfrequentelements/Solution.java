package leetcode.topkfrequentelements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var numToCount = new HashMap<Integer, Integer>();

        for (int num : nums) {
            numToCount.put(num, numToCount.getOrDefault(num, 0) + 1);
        }

        var sorted = numToCount.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // count desc
                .collect(Collectors.toList());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sorted.get(i).getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [1,2]
        System.out.println(Arrays.toString(s.topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
        // [1,3]
        System.out.println(Arrays.toString(s.topKFrequent(new int[]{1,1,1,2,3,3}, 2)));
    }
}
