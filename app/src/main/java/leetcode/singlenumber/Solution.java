package leetcode.singlenumber;

import java.util.HashMap;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        var counts = new HashMap<Integer, Integer>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }
        return counts.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.singleNumber(new int[]{2, 2, 1})); // 1
        System.out.println(s.singleNumber(new int[]{4, 1, 2, 1, 2})); // 4
        System.out.println(s.singleNumber(new int[]{1})); // 1
    }
}
