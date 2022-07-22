package leetcode.validmountainarray;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        boolean increasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            int next = arr[i + 1];
            if (curr > next) {
                if (i == 0) {
                    return false; // no increase
                }
                increasing = false;
            }
            if (increasing && curr >= next) {
                return false;
            }
            if (!increasing && curr <= next) {
                return false;
            }
        }

        if (increasing) {
            return false; // no decrease
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.validMountainArray(new int[]{2,1})); // false
        System.out.println(s.validMountainArray(new int[]{3,5,5})); // false
        System.out.println(s.validMountainArray(new int[]{0,3,2,1})); // true
        System.out.println(s.validMountainArray(new int[]{0,1,2,3})); // false
        System.out.println(s.validMountainArray(new int[]{3,2,1,0})); // false
    }
}
