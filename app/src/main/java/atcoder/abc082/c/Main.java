package atcoder.abc082.c;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        var numToCount = new HashMap<Integer, Integer>();
        for (int num : a) {
            numToCount.put(num, numToCount.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (int num : numToCount.keySet()) {
            int count = numToCount.get(num);
            if (count > num) {
                ans += count - num;
            } else if (count < num) {
                ans += count;
            }
        }
        System.out.println(ans);
    }
}
