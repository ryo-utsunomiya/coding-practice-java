package leetcode.twosum2;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [1,2]
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9)));
        // [1,3]
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 3, 4}, 6)));
        // [1,2]
        System.out.println(Arrays.toString(s.twoSum(new int[]{-1, 0}, -1)));
        // [3,4]
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 26)));
    }
}
