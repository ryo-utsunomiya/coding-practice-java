package leetcode.checkifnanditsdoubleexist;

import java.util.HashSet;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        var nums = new HashSet<Integer>();
        for (int num : arr) {
            if (nums.contains(num * 2) || (num % 2 == 0 && nums.contains(num / 2))) {
                return true;
            }
            nums.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.checkIfExist(new int[]{10, 2, 5, 3})); // true
        System.out.println(s.checkIfExist(new int[]{7, 1, 14, 11})); // true
        System.out.println(s.checkIfExist(new int[]{3, 1, 7, 11})); // false
    }
}
