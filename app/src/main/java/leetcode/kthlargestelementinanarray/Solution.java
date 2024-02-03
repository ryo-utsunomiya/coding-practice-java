package leetcode.kthlargestelementinanarray;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>();

        // 最小ヒープのサイズをk以下に保つことで、ヒープの先頭の要素がnumsのk番目に大きな数になるようにする
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll(); // 先頭（最小値）を削除
            }
        }

        if (heap.isEmpty()) {
            throw new IllegalStateException("heap is empty");
        }
        return heap.peek();
    }

    // "Quick Select" アルゴリズムを使った解法
    public int findKthLargestQuickSelect(int[] nums, int k) {
        int n = nums.length;
        int kthPosition = n - k;
        return quickSelect(nums, 0, n - 1, kthPosition);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) {
            return nums[left];
        }

        int pivotIndex = partition(nums, left, right);

        // partition の結果として取得した pivot の index が
        // (1) kと等しい場合: 探索対象が見つかった
        // (2) kより小さい場合: pivot より左側だけ探索する
        // (3) kより大きい場合: pivot より右側だけ探索する
        if (k == pivotIndex) {
            return nums[k];
        } else if (k < pivotIndex) {
            return quickSelect(nums, left, pivotIndex - 1, k);
        } else {
            return quickSelect(nums, pivotIndex + 1, right, k);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right]; // 末尾の値を pivot にする
        int i = left;

        // 左端から順に配列を走査し、pivotより小さい値は左にswapする
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        // ここで i の値は pivot より小さい値の個数になっている。
        // pivot をiの場所に移動すると、pivotの左側はpivotより小さく、pivotの右側はpivotより大きくなる
        // [3,2,1,5,6,4] i=3 の場合、swap(3, 5)すると [3,2,1,4,5,6] になる
        swap(nums, i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(s.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
        System.out.println(s.findKthLargestQuickSelect(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(s.findKthLargestQuickSelect(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}
