package leetcode.duplicatezeros;

import java.util.Arrays;

public class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                insertZero(arr, i + 1);
                i++; // avoid duplicating inserted zero
            }
        }
    }

    private void insertZero(int[] arr, int index) {
        if (index >= arr.length) {
            return; // cannot duplicate zero
        }

        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = 0;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var arr = new int[]{1,0,2,3,0,4,5,0};
            s.duplicateZeros(arr);
            System.out.println(Arrays.toString(arr));
        }
        {
            var arr = new int[]{1,2,3};
            s.duplicateZeros(arr);
            System.out.println(Arrays.toString(arr));
        }
        {
            var arr = new int[]{1,5,2,0,6,8,0,6,0};
            s.duplicateZeros(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
