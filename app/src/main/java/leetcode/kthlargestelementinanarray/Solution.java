package leetcode.kthlargestelementinanarray;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>(Comparator.comparingInt(n -> n));

        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        assert !heap.isEmpty();
        return heap.poll();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(s.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}
