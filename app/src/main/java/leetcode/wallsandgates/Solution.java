package leetcode.wallsandgates;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {
    private static final int GATE = 0;
    private static final int EMPTY = 2147483647;
    private static final int[][] DIRECTIONS = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;

        Queue<int[]> pointsToVisit = new ArrayDeque<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (rooms[r][c] == GATE) {
                    pointsToVisit.offer(new int[]{r, c});
                }
            }
        }

        while (!pointsToVisit.isEmpty()) {
            int[] point = pointsToVisit.poll();
            int row = point[0];
            int col = point[1];

            for (int[] d : DIRECTIONS) {
                int r = row + d[0];
                int c = col + d[1];
                if (r >= 0 && c >= 0 && r < m && c < n && rooms[r][c] == EMPTY) {
                    rooms[r][c] = rooms[row][col] + 1;
                    pointsToVisit.offer(new int[]{r, c});
                }
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var rooms = new int[][]{
                    new int[]{2147483647, -1, 0, 2147483647},
                    new int[]{2147483647, 2147483647, 2147483647, -1},
                    new int[]{2147483647, -1, 2147483647, -1},
                    new int[]{0, -1, 2147483647, 2147483647},
            };
            s.wallsAndGates(rooms);
            System.out.println(Arrays.deepToString(rooms));
        }
        {
            var rooms = new int[][]{{-1}};
            s.wallsAndGates(rooms);
            System.out.println(Arrays.deepToString(rooms));
        }
    }
}
