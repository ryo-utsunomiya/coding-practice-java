package atcoder.past202104.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        // 累積和を求める
        long[] cs = new long[n + 1]; // [0, 2, 2, 4, 3, 3, -1]
        cs[0] = 0;
        for (int i = 0; i < n; i++) {
            cs[i + 1] = cs[i] + a[i];
        }

        var sb = new StringBuilder();
        for (int x = 0; x < n - k + 1; x++) {
            int l = x;
            int r = x + k;
            sb.append(cs[r] - cs[l]).append("\n");
        }
        System.out.print(sb);
    }
}
