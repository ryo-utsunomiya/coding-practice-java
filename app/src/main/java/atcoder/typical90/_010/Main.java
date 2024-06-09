package atcoder.typical90._010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 生徒数
        int[] c = new int[n]; // クラス
        int[] p = new int[n]; // 生徒の点数
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }

        // それぞれのクラスの累積和を求める
        int[] cs1 = new int[n + 1]; // [0, 72, 72,  72, ...
        int[] cs2 = new int[n + 1]; // [0,  0, 78, 182, ...
        cs1[0] = 0;
        cs2[0] = 0;
        for (int i = 0; i < n; i++) {
            cs1[i + 1] = cs1[i] + (c[i] == 1 ? p[i] : 0);
            cs2[i + 1] = cs2[i] + (c[i] == 2 ? p[i] : 0);
        }

        int q = scanner.nextInt(); // 質問の個数
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt();
            System.out.printf("%d %d\n", cs1[r] - cs1[l], cs2[r] - cs2[l]);
        }

        scanner.close();
    }
}
