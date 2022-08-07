package leetcode.fibonaccinumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.fib(0));
        System.out.println(s.fib(1));
        System.out.println(s.fib(2));
        System.out.println(s.fib(30));
    }
}
