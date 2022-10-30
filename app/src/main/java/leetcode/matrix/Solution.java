package leetcode.matrix;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution {
    private static final int[][] DIRECTION = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1},
    };

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] distances = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(distances[i], Integer.MAX_VALUE);
        }

        var queue = new ArrayDeque<int[]>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    distances[i][j] = 0;
                    queue.offer(new int[]{i,j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int i = current[0];
            int j = current[1];
            for (int[] d : DIRECTION) {
                int r = i + d[0];
                int c = j + d[1];
                if (0 <= r && r < m && 0 <= c && c < n) {
                    if (distances[r][c] > distances[i][j] + 1) {
                        distances[r][c] = distances[i][j] + 1;
                        queue.offer(new int[]{r,c});
                    }
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var result = s.updateMatrix(new int[][]{
                    {0,0,0},
                    {0,1,0},
                    {0,0,0},
            });
            System.out.println(Arrays.deepToString(result));
        }
        {
            var result = s.updateMatrix(new int[][]{
                    {0,0,0},
                    {0,1,0},
                    {1,1,1},
            });
            System.out.println(Arrays.deepToString(result));
        }
    }
}
