package leetcode.perfectsquares;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Solution {
    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(n);

        int level = 0;
        while (!nums.isEmpty()) {
            level++;
            Set<Integer> nextNums = new HashSet<>();
            for (var num : nums) {
                for (var square : squares) {
                    if (Objects.equals(num, square)) {
                        return level;
                    } else if (num < square) {
                        break;
                    } else {
                        nextNums.add(num - square);
                    }
                }
            }
            if (!nextNums.isEmpty()) {
                nums = nextNums;
            }
        }

        return level;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.numSquares(12)); // 3(4 + 4 + 4)
        System.out.println(s.numSquares(13)); // 2(4 + 9)
        System.out.println(s.numSquares(7168)); // 4
    }
}
