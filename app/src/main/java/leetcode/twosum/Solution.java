package leetcode.twosum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        var indexByValue = new HashMap<Integer, Integer>();

        for (int i = 0, len = nums.length; i < len; i++) {
            int complement = target - nums[i];
            if (indexByValue.containsKey(complement)) {
                return new int[]{indexByValue.get(complement), i};
            }
            indexByValue.put(nums[i], i);
        }
        return null;
    }
}
