package leetcode.diagonaltraverse;

import java.util.*;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;

        var map = new LinkedHashMap<Integer, List<Integer>>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!map.containsKey(i+j)) {
                    map.put(i+j, new ArrayList<>());
                }
                map.get(i+j).add(matrix[i][j]);
            }
        }

        int[] result = new int[N * M];
        int resultIndex = 0;
        for (var entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            if (entry.getKey() % 2 == 0) {
                Collections.reverse(list);
            }
            for (var n : list) {
                result[resultIndex] = n;
                resultIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var mat = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(s.findDiagonalOrder(mat)));
    }
}
