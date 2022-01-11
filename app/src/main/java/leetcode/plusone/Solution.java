package leetcode.plusone;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        // here, all digits are 0
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 1,2,4
        System.out.println(Arrays.toString(s.plusOne(new int[]{1, 2, 3})));
        // 4,3,2,2
        System.out.println(Arrays.toString(s.plusOne(new int[]{4, 3, 2, 1})));
        // 1,0
        System.out.println(Arrays.toString(s.plusOne(new int[]{9})));
        // 1,0,0
        System.out.println(Arrays.toString(s.plusOne(new int[]{9, 9})));
        // 9,0,0,0
        System.out.println(Arrays.toString(s.plusOne(new int[]{8, 9, 9, 9})));
    }
}
