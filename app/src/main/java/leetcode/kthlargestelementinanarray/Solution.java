package leetcode.kthlargestelementinanarray;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>();

        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        if (heap.isEmpty()) {
            throw new IllegalStateException("heap is empty");
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(s.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}
