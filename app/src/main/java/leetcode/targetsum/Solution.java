package leetcode.targetsum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return calculateNumWays(nums, target, 0, 0, new HashMap<>());
    }

    private int calculateNumWays(int[] nums, int target, int index, int sum,
                                 Map<Integer, Map<Integer, Integer>> memo) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        } else if (memo.containsKey(index) && memo.get(index).containsKey(sum)) {
            return memo.get(index).get(sum);
        }

        int numWaysAdd = calculateNumWays(nums, target, index + 1, sum + nums[index], memo);
        int numWaysSub = calculateNumWays(nums, target, index + 1, sum - nums[index], memo);
        int numWaysTotal = numWaysAdd + numWaysSub;

        if (!memo.containsKey(index)) {
            memo.put(index, new HashMap<>());
        }
        memo.get(index).put(sum, numWaysTotal);

        return numWaysTotal;
    }


    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.findTargetSumWays(new int[]{1,1,1,1,1}, 3)); // 5
        System.out.println(s.findTargetSumWays(new int[]{1}, 1)); // 1
        System.out.println(s.findTargetSumWays(new int[]{2,1}, 1)); // 1
        System.out.println(s.findTargetSumWays(new int[]{2,1}, 3)); // 1
    }
}
