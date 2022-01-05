package leetcode.intersectionoftwoarrays;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        var uniqueNums = new HashSet<Integer>();
        for (int num : nums1) {
            uniqueNums.add(num);
        }
        var resultSet = new HashSet<Integer>();
        for (int num : nums2) {
            if (uniqueNums.contains(num)) {
                resultSet.add(num);
            }
        }
        return resultSet.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [2]
        System.out.println(
                Arrays.toString(s.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
        );
        // [9,4]
        System.out.println(
                Arrays.toString(s.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4}))
        );
    }
}
