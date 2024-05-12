package atcoder.past202010.e;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); // 頂点の個数
        int m = sc.nextInt(); // 辺の個数
        int q = sc.nextInt(); // クエリの数

        // 辺
        int[] u = new int[m+1];
        int[] v = new int[m+1];
        for (int i = 1; i <= m; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        // 頂点の色の初期値
        int[] c = new int[n+1];
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
        }
        sc.nextLine(); // 改行を捨てる

        // クエリ
        String[] s = new String[q];
        for (int i = 0; i < q; i++) {
            s[i] = sc.nextLine();
        }
        sc.close();

        Pattern pattern = Pattern.compile(" ");
        for (String query : s) {
            String[] parts = pattern.split(query);
            String command = parts[0];

            // xの現在の色を出力し
            int x = Integer.parseInt(parts[1]);
            System.out.println(c[x]);

            switch (command) {
                case "1":
                    // xに隣接する全ての頂点の色をxの色で塗り替える
                    for (int i = 1; i <= m; i++) {
                        if (u[i] == x) {
                            c[v[i]] = c[x];
                        } else if (v[i] == x) {
                            c[u[i]] = c[x];
                        }
                    }
                case "2":
                    // xの色をyで上書きする
                    int y = Integer.parseInt(parts[2]);
                    c[x] = y;
            }
        }
    }
}
