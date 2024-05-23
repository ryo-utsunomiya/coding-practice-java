package atcoder.typical90._78;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); // 頂点の数
        int m = sc.nextInt(); // 辺の数
        // 頂点を結ぶ辺を表すグラフ
        var g = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            g.add(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;
            b--;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        sc.close();

        int ans = 0;
        for (int i = 1; i < n; i++) {
            // 自分自身より頂点番号が小さい隣接頂点の数を数える
            int numSmallerNodes = 0;
            for (int j = 0; j < i; j++) {
                if (g.get(i).contains(j) || g.get(j).contains(i)) {
                    numSmallerNodes++;
                }
            }
            if (numSmallerNodes == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
