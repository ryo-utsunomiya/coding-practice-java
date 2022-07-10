package leetcode.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class Solution {
    public List<String> fizzBuzz(int n) {
        var result = new LinkedList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.fizzBuzz(15));
    }
}
