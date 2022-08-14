package leetcode.numberofislands;

public class Solution {
    int[][] DIRECTIONS = new int[][]{ {1,0}, {-1,0}, {0,1}, {0,-1} };

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;

        int answer = 0;
        for (int row = 0; row < nr; row++) {
            for (int col = 0; col < nc; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    answer++;
                }
            }
        }
        return answer;
    }

    void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '0';

        int nr = grid.length;
        int nc = grid[0].length;

        for (int[] d : DIRECTIONS) {
            int r = row + d[0];
            int c = col + d[1];
            if (r >= 0 && c >= 0 && r < nr && c < nc && grid[r][c] == '1') {
                dfs(grid, r, c);
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.numIslands(
                new char[][]{
                        new char[]{'1', '1', '1', '1', '0'},
                        new char[]{'1', '1', '0', '1', '0'},
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'0', '0', '0', '0', '0'},
                }
        ));
        System.out.println(s.numIslands(
                new char[][]{
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'0', '0', '1', '0', '0'},
                        new char[]{'0', '0', '0', '1', '1'},
                }
        ));
    }
}
