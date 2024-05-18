package atcoder.abc166.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); // 展望台の数
        int m = sc.nextInt(); // 展望台を結ぶ道の数
        int[] h = new int[n]; // それぞれの展望台の標高の配列
        for (int i = 0; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        // それぞれの展望台が条件を満たすか
        boolean[] g = new boolean[n];
        Arrays.fill(g, true);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 0始まりにする
            a--;
            b--;
            if (h[a] <= h[b]) { // aの高さはb以下なのでaは条件を満たさない
                g[a] = false;
            }
            if (h[a] >= h[b]) { // bの高さはa以下なのでbは条件を満たさない
                g[b] = false;
            }
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (g[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
