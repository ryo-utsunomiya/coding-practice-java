package leetcode.problems.removeelement;

import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n != val) {
                swap(nums, i, j);
                j++;
            }
        }
        return j;
    }

    void swap(int[] ints, int from, int to) {
        int tmp = ints[from];
        ints[from] = ints[to];
        ints[to] = tmp;
    }

    public static void main(String[] args) {
//        test(new int[]{3, 2, 2, 3}, 3);
        test(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }

    static void test(int[] nums, int val) {
        var s = new Solution();
        var k = s.removeElement(nums, val);
        System.out.println(k); // 2
        System.out.println(Arrays.toString(nums)); // [2,2,_,_]
    }
}
