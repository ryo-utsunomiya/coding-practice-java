package udemyalgo.deleteminornumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> deleteMinorNumbers(List<Integer> numbersA, List<Integer> numbersB) {
        // make the list mutable
        numbersA = new ArrayList<>(numbersA);
        numbersB = new ArrayList<>(numbersB);

        Map<Integer, Integer> numCountsA = new HashMap<>();
        for (int n : numbersA) {
            numCountsA.put(n, numCountsA.getOrDefault(n, 0) + 1);
        }

        Map<Integer, Integer> numCountsB = new HashMap<>();
        for (int n : numbersB) {
            numCountsB.put(n, numCountsB.getOrDefault(n, 0) + 1);
        }

        numbersA.removeIf(n -> numCountsB.containsKey(n) && numCountsA.get(n) < numCountsB.get(n));
        numbersB.removeIf(n -> numCountsA.containsKey(n) && numCountsB.get(n) < numCountsA.get(n));

        return List.of(numbersA, numbersB);
    }

    public static void main(String[] args) {
        var s = new Solution();
        var a = List.of(1,2,3,4,4,5,5,8,10);
        var b = List.of(4,5,5,5,6,7,8,8,10);
        var result = s.deleteMinorNumbers(a, b);
        System.out.println(result.get(0)); // [1,2,3,4,4,10]
        System.out.println(result.get(1)); // [5,5,5,6,7,8,8,10]
    }
}
