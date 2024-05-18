package atcoder.abc061.b;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); // 都市の数

        // 都市ごとの道路のグラフ
        var g = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            g.add(i, new ArrayList<>());
        }

        int m = sc.nextInt(); // 道路の数
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

        for (int i = 0; i < n; i++) {
            System.out.println(g.get(i).size());
        }
    }
}
