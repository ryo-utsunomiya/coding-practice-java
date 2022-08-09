package udemyalgo.addone;

import java.util.List;

public class Solution {
    public int addOne(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 1;
        }

        int sum = 1;
        int d = 1;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int n = numbers.get(i);
            sum += n * d;
            d *= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.addOne(List.of(0))); // 1
        System.out.println(s.addOne(List.of(1))); // 2
        System.out.println(s.addOne(List.of(9))); // 10
        System.out.println(s.addOne(List.of(1, 0))); // 11
        System.out.println(s.addOne(List.of(8, 9))); // 90
        System.out.println(s.addOne(List.of(0, 0, 0, 9, 9, 9, 9))); // 10000
    }
}
