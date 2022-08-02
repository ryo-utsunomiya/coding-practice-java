package leetcode.wallsandgates;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static final int GATE = 0;
    private static final int INF = 2147483647;
    private static final int[][] DIRECTIONS = new int[][] {
            new int[]{1,0}, // south
            new int[]{0,1}, // east
            new int[]{-1,0}, // north
            new int[]{0,-1}, // west
    };

    public void wallsAndGates(int[][] rooms) {
        int n = rooms.length;
        if (n == 0) {
            return;
        }
        int m = rooms[0].length;
        Queue<int[]> pointsToVisit = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rooms[i][j] == GATE) {
                    pointsToVisit.offer(new int[]{i,j});
                }
            }
        }
        while (!pointsToVisit.isEmpty()) {
            int[] point = pointsToVisit.poll();
            int row = point[0];
            int col = point[1];
            for (int[] direction : DIRECTIONS) {
                int r = row + direction[0];
                int c = col + direction[1];
                if (r < 0 || c < 0 || r >= n || c >= m || rooms[r][c] != INF) {
                    continue;
                }
                // the distance is original point + 1
                rooms[r][c] = rooms[row][col] + 1;
                pointsToVisit.offer(new int[]{r, c});
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var rooms = new int[][]{
                    new int[]{2147483647,-1,0,2147483647},
                    new int[]{2147483647,2147483647,2147483647,-1},
                    new int[]{2147483647,-1,2147483647,-1},
                    new int[]{0,-1,2147483647,2147483647},
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
