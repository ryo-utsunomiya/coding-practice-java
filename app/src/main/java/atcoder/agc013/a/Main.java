package atcoder.agc013.a;

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

        int ans = 0;

        for (int i = 0; i < n; i++) {
            // 同じ値の場合は飛ばす
            while (i + 1 < n && a[i] == a[i + 1]) {
                i++;
            }

            if (i + 1 < n && a[i] < a[i + 1]) {
                // 増加
                while (i + 1 < n && a[i] <= a[i + 1]) {
                    i++;
                }
            } else if (i + 1 < n && a[i] > a[i + 1]) {
                // 減少
                while (i + 1 < n && a[i] >= a[i + 1]) {
                    i++;
                }
            }

            ans++;
        }

        System.out.println(ans);
    }
}
