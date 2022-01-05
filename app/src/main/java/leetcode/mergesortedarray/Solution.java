package leetcode.mergesortedarray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while (p >= 0 && p1 >= 0 && p2 >= 0) {
            int a = nums1[p1];
            int b = nums2[p2];
            if (a > b) {
                nums1[p] = a;
                p1--;
            } else {
                nums1[p] = b;
                p2--;
            }
            p--;
        }
        while (p1 >= 0) {
            nums1[p] = nums1[p1];
            p1--;
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        var nums2 = new int[]{2, 5, 6};
        s.merge(nums1, 3, nums2, 3); // [1, 2, 2, 3, 5, 6]
//        var nums1 = new int[]{1};
//        var nums2 = new int[]{};
//        s.merge(nums1, 1, nums2, 0); // [1]
//        var nums1 = new int[]{0};
//        var nums2 = new int[]{1};
//        s.merge(nums1, 0, nums2, 1); // [1]
//        var nums1 = new int[]{2, 0};
//        var nums2 = new int[]{1};
//        s.merge(nums1, 1, nums2, 1);
//        var nums1 = new int[]{4, 5, 6, 0, 0, 0};
//        var nums2 = new int[]{1, 2, 3};
//        s.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
