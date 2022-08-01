package leetcode.movingaveragefromdatastream;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class MovingAverage {
        private final int size;
        private final Queue<Integer> numbers;

        public MovingAverage(int size) {
            this.size = size;
            this.numbers = new LinkedList<>();
        }

        public double next(int val) {
            if (numbers.size() >= size) {
                numbers.poll();
            }
            numbers.offer(val);

            double sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return sum / numbers.size();
        }
    }

    public static void main(String[] args) {
        var ma = new MovingAverage(3);
        System.out.println(ma.next(1));
        System.out.println(ma.next(10));
        System.out.println(ma.next(3));
        System.out.println(ma.next(5));
    }
}
