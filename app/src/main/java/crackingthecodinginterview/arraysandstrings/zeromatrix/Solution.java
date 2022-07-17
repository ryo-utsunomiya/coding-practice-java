package crackingthecodinginterview.arraysandstrings.zeromatrix;

import java.util.Arrays;

// 1.8 Zero Matrix
// Write an algorithm such that if an element in a MxN matrix is 0, its entire row and column are set to 0.
public class Solution {
    public void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                nullifyRow(matrix, i);
            }
        }

        for (int j = 0; j < column.length; j++) {
            if (column[j]) {
                nullifyColumn(matrix, j);
            }
        }
    }

    private void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            // m = 2, n = 3
            var mat = new int[3][2];
            mat[0][0] = 0; // here is 0
            mat[0][1] = 1; // -> 0
            mat[1][0] = 2; // -> 0
            mat[1][1] = 3; // -> 0
            mat[2][0] = 4; // -> 0
            mat[2][1] = 0; // also 0
            s.setZeros(mat);
            System.out.println(Arrays.deepToString(mat)); // [[0, 0], [0, 3], [0, 5]]
        }
    }
}
