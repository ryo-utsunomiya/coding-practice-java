package leetcode.replaceelementswithgreatestelementonrightside;

import java.util.Arrays;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int n = arr[i];
            arr[i] = greatest;
            if (n > greatest) {
                greatest = n;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            System.out.println(Arrays.toString(s.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
            System.out.println(Arrays.toString(s.replaceElements(new int[]{400})));
        }
    }
}
