package leetcode.sqrt;

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 2;
        int right = x / 2;
        int pivot;
        long pivotSquare;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            pivotSquare = (long)pivot * pivot;
            if (pivotSquare > x) {
                right = pivot - 1;
            } else if (pivotSquare < x) {
                left = pivot + 1;
            } else {
                return pivot;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.mySqrt(0)); // 0
        System.out.println(s.mySqrt(1)); // 1
        System.out.println(s.mySqrt(2)); // 1
        System.out.println(s.mySqrt(3)); // 1
        System.out.println(s.mySqrt(4)); // 2
        System.out.println(s.mySqrt(8)); // 2
        System.out.println(s.mySqrt(9)); // 3
        System.out.println(s.mySqrt(Integer.MAX_VALUE)); // ???
    }
}
