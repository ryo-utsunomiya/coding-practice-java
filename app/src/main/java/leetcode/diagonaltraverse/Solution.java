package leetcode.diagonaltraverse;

import java.util.*;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        return new int[]{};
    }

    public static void main(String[] args) {
        var s = new Solution();
        var mat = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(s.findDiagonalOrder(mat)));
    }
}
