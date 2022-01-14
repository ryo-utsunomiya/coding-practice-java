package leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        var result = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            var row = new ArrayList<Integer>();
            row.add(1);
            if (result.size() >= 2) {
                for (int j = 0; j < result.size() - 1; j++) {
                    List<Integer> prevRow = result.get(i - 1);
                    row.add(prevRow.get(j) + prevRow.get(j + 1));
                }
            }
            if (result.size() >= 1) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var rows = s.generate(1);
        for (var row : rows) {
            System.out.println(row);
        }
    }
}
