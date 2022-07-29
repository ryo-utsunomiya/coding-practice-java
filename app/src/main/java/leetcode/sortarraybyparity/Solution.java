package leetcode.sortarraybyparity;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length]; // Space: O(n)
        int index = 0;

        // Time: O(n)
        for (int n : nums) {
            if (n % 2 == 0) {
                result[index] = n;
                index++;
            }
        }
        for (int n : nums) {
            if (n % 2 != 0) {
                result[index] = n;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{0})));
    }
}
