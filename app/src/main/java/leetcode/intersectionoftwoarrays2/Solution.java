package leetcode.intersectionoftwoarrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        var result = new ArrayList<Integer>();
        int i = 0;
        for (int n : nums1) {
            while (i < nums2.length && nums2[i] < n) {
                i++;
            }

            if (i < nums2.length && n == nums2[i]) {
                result.add(n);
                i++;
            }
        }
        return result.stream().mapToInt(it -> it).toArray();
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [2, 2]
        System.out.println(
                Arrays.toString(s.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
        );
        // [9,4]
        System.out.println(
                Arrays.toString(s.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}))
        );
        // [1]
        System.out.println(
                Arrays.toString(s.intersect(new int[]{1,2}, new int[]{1,1}))
        );
        // [1]
        System.out.println(
                Arrays.toString(s.intersect(new int[]{1,2,2,1}, new int[]{2}))
        );
    }
}
