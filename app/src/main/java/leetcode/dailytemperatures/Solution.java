package leetcode.dailytemperatures;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        var prevDays = new ArrayDeque<Integer>();

        for (int currDay = 0; currDay < n; currDay++) {
            while (!prevDays.isEmpty() && temperatures[currDay] > temperatures[prevDays.peek()]) {
                int prevDay = prevDays.pop();
                answer[prevDay] = currDay - prevDay;
            }
            prevDays.push(currDay);
        }

        return answer;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [1,1,4,2,1,1,0,0]
        System.out.println(Arrays.toString(
                s.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})
        ));
        // [1,1,1,0]
        System.out.println(Arrays.toString(
                s.dailyTemperatures(new int[]{30,40,50,60})
        ));
        // [1,1,0]
        System.out.println(Arrays.toString(
                s.dailyTemperatures(new int[]{30,60,90})
        ));
    }
}
