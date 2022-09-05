package leetcode.validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // rule 1: Each row must contain the digits 1-9 without repetition.
        for (int row = 0; row < 9; row++) {
            Set<Character> usedChar = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.') {
                    if (usedChar.contains(c)) {
                        return false;
                    }
                    usedChar.add(c);
                }
            }
            usedChar.clear();
        }

        // rule 2: Each column must contain the digits 1-9 without repetition.
        for (int col = 0; col < 9; col++) {
            Set<Character> usedChar = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c != '.') {
                    if (usedChar.contains(c)) {
                        return false;
                    }
                    usedChar.add(c);
                }
            }
            usedChar.clear();
        }

        // rule 3: Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {
                Set<Character> usedChar = new HashSet<>();
                for (int row = rowStart; row < rowStart + 3; row++) {
                    for (int col = colStart; col < colStart + 3; col++) {
                        char c = board[row][col];
                        if (c != '.') {
                            if (usedChar.contains(c)) {
                                return false;
                            }
                            usedChar.add(c);
                        }
                    }
                }
                usedChar.clear();
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // true
        System.out.println(s.isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        }));
        // false
        System.out.println(s.isValidSudoku(new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        }));
    }
}
