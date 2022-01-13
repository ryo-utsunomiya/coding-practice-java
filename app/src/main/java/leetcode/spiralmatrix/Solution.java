package leetcode.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        var result = new ArrayList<Integer>();

        int minY = 0, minX = 0, maxY = matrix.length - 1, maxX = matrix[0].length - 1;
        while (maxY >= minY && maxX >= minX) {
            simulate(matrix, minY, minX, maxY, maxX, result);
            minY++;
            minX++;
            maxY--;
            maxX--;
        }

        return result;
    }

    private void simulate(
            int[][] matrix,
            int minY,
            int minX,
            int maxY,
            int maxX,
            ArrayList<Integer> result
    ) {
        // first row
        int y = minY;
        int x = minX;
        while (x <= maxX) {
            result.add(matrix[y][x++]);
        }
        // last column
        y = minY + 1;
        x = maxX;
        while (y <= maxY) {
            result.add(matrix[y++][x]);
        }
        if (minY != maxY) {
            // last row
            y = maxY;
            x = maxX - 1;
            while (x >= minX) {
                result.add(matrix[y][x--]);
            }
        }
        if (minX != maxX) {
            // first column
            y = maxY - 1;
            x = minX;
            while (y >= minY + 1) {
                result.add(matrix[y--][x]);
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 1,2,3,6,9,8,7,4,5
        System.out.println(s.spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        }));
        // 1,2,3,4,8,12,11,10,9,5,6,7
        System.out.println(s.spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        }));
    }
}
