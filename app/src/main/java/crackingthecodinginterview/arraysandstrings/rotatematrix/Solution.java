package crackingthecodinginterview.arraysandstrings.rotatematrix;

import java.util.Arrays;

// 1.7 Rotate Matrix
// Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
// write a method to rotate the image by 90 degrees. Can you do this in place?
public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("matrix shape must be NxN and N >= 1");
        }

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();

        // [
        //  [1,2,3]
        //  [4,5,6]
        //  [7,8,9]
        // ]
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // [
        //  [7,4,1]
        //  [8,5,2]
        //  [9,6,3]
        // ]
        s.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
