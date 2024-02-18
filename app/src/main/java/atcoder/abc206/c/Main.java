package atcoder.abc206.c;

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
        for (int i = 0; i < n; i++) {
            numToCount.put(a[i], numToCount.getOrDefault(a[i], 0) + 1);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += n - numToCount.get(a[i]);
        }

        System.out.println(ans / 2);
    }
}
