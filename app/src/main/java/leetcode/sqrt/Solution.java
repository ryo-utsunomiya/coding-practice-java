package leetcode.sqrt;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        // 二分探索
        int left = 1; // 1以上の整数の平方根は1以上になる
        int right = x;

        // x = 4
        // (1) low = 1, high = 4, mid = 2
        //     2 * 2 = 4 (== x)
        //     ans = 2

        // x = 8
        // (1) low = 1, high = 8, mid = 4
        //     4 * 4 = 16 (> x)
        //     high = 4-1 = 3
        // (2) low = 1, high = 3, mid = 2
        //     2 * 2 = 4 (< x)
        //     (2+1) * (2+1) = 9 (> x)
        //     ans = 2
        while (true) {
            // (left + right) / 2 だとオーバーフローすることがあるので
            // left に (right - left) / 2 を足す
            int mid = left + (right - left) / 2;

            // mid * mid > x だとオーバーフローすることがあるので
            // 両辺をmid で割った mid > x / mid で判定する
            if (mid > x / mid) {
                // mid * mid が x より大きい場合は、midは大きすぎる
                right = mid - 1;
            } else {
                // mid * mid <= x かつ
                // (mid+1) * (mid+1) > x の場合、midが答え
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                // mid は小さすぎる
                left = mid + 1;
            }
        }
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
        System.out.println(s.mySqrt(Integer.MAX_VALUE)); // 46340
    }
}
