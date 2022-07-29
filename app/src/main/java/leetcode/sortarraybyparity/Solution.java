package leetcode.sortarraybyparity;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
//        int[] result = new int[nums.length]; // Space: O(n)
//        int index = 0;
//
//        // Time: O(n)
//        for (int n : nums) {
//            if (n % 2 == 0) {
//                result[index] = n;
//                index++;
//            }
//        }
//        for (int n : nums) {
//            if (n % 2 != 0) {
//                result[index] = n;
//                index++;
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                // find the event number in the array
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        swap(nums, i, j);
                    }
                }
            }
        }

        return nums;
    }

    void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{0})));
    }
}
