package atcoder.abc068.c;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); // 島の数
        int m = sc.nextInt(); // 定期便の種類

        // それぞれの島から定期便で到達可能な島を示すグラフ
        var g = new ArrayList<HashSet<Integer>>(n);
        for (int i = 0; i < n; i++) {
            g.add(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 0始まりにする
            a--;
            b--;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        sc.close();

        // 島1から到達可能な島をキューに入れる
        var queue = new ArrayDeque<>(g.get(0));

        // いずれかの島から島Nに到達可能か調べる
        boolean possible = false;
        while (!queue.isEmpty()) {
            int next = queue.poll();
            if (g.get(next).contains(n - 1)) {
                possible = true;
                break;
            }
        }
        System.out.println(possible ? "POSSIBLE" : "IMPOSSIBLE");
    }
}
