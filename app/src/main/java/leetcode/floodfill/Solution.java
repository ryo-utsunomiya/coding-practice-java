package leetcode.floodfill;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    private static final int[][] DIRECTION = new int[][] {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1},
    };

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorOfStartingPoint = image[sr][sc];
        if (color == colorOfStartingPoint) {
            return image;
        }

        int n = image.length;
        int m = image[0].length;

        Deque<int[]> pixelsToFill = new ArrayDeque<>();
        pixelsToFill.offer(new int[]{sr, sc});
        image[sr][sc] = color;

        while (!pixelsToFill.isEmpty()) {
            int[] pixel = pixelsToFill.poll();
            int row = pixel[0];
            int col = pixel[1];

            for (int[] d : DIRECTION) {
                int r = row + d[0];
                int c = col + d[1];
                if (0 <= r && r < n && 0 <= c && c < m && image[r][c] == colorOfStartingPoint) {
                    pixelsToFill.offer(new int[]{r, c});
                    image[r][c] = color;
                }
            }
        }

        return image;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var result = s.floodFill(
                    new int[][]{
                            {1,1,1},
                            {1,1,0},
                            {1,0,1}
                    },
                    1,
                    1,
                    2
            );
            System.out.println(Arrays.deepToString(result));
        }
        {
            var result = s.floodFill(
                    new int[][]{
                            {0,0,0},
                            {0,0,0}
                    },
                    0,
                    0,
                    0
            );
            System.out.println(Arrays.deepToString(result));
        }
    }
}
