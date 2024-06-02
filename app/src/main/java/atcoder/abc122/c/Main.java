package atcoder.abc122.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = scanner.nextInt() - 1; // 0始まりにする
            r[i] = scanner.nextInt();
        }
        scanner.close();

        // 累積和 cs を求める
        int[] cs = new int[n + 1];
        for (int i = 1; i < n; i++) {
            boolean isAc = "AC".equals(s.substring(i-1, i+1));
            cs[i + 1] = cs[i] + (isAc ? 1 : 0);
        }

        // 各クエリに答える
        for (int i = 0; i < q; i++) {
            System.out.println(cs[r[i]] - cs[l[i] + 1]);;
        }
    }
}
