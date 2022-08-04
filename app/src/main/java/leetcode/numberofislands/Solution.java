package leetcode.numberofislands;

public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;

        int answer = 0;
        for (int row = 0; row < nr; row++) {
            for (int col = 0; col < nc; col++) {
                if (dfs(grid, row, col)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    boolean dfs(char[][] grid, int row, int col) {
        int nr = grid.length;
        int nc = grid[0].length;
        if (row < 0 || col < 0 || row >= nr || col >= nc || grid[row][col] == '0') {
            return false;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);

        return true;
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
