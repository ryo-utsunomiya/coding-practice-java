package leetcode.problems.movezeros;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class Solution {
    public void moveZeroes(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                swap(nums, lastNonZeroFoundAt, cur);
                lastNonZeroFoundAt++;
            }
        }
    }

    void swap(int[] ints, int from, int to) {
        int tmp = ints[from];
        ints[from] = ints[to];
        ints[to] = tmp;
    }

    public static void main(String[] args) {
        var s = new Solution();
//        var nums = new int[]{0};
//        var nums = new int[]{0, 0};
//        var nums = new int[]{0, 1};
//        var nums = new int[]{1, 0};
        var nums = new int[]{0, 1, 0, 3, 12}; // [1,3,12,0,0]
//        var nums = new int[]{0, 0, 1}; // [0,1,0] -> [1,0,0]
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
