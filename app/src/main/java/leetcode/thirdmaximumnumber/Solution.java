package leetcode.thirdmaximumnumber;

import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public int thirdMax(int[] nums) {
        var maximums = new HashSet<Integer>();
        for (int num : nums) {
            maximums.add(num);
            if (maximums.size() > 3) {
                maximums.remove(Collections.min(maximums));
            }
        }
        if (maximums.size() == 3) {
            return Collections.min(maximums);
        } else {
            return Collections.max(maximums);
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.thirdMax(new int[]{3,2,1})); // 1
        System.out.println(s.thirdMax(new int[]{1,2})); // 2
        System.out.println(s.thirdMax(new int[]{2,2,3,1})); // 1
        System.out.println(s.thirdMax(new int[]{1,2,2,5,3,5})); // 2
        System.out.println(s.thirdMax(new int[]{1,2,-2147483648})); // -2147483648
        System.out.println(s.thirdMax(new int[]{1,-2147483648,2})); // -2147483648
    }
}
