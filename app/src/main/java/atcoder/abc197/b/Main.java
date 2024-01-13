package atcoder.abc197.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }

        int ans = 1; // 少なくとも自分自身は見えるので1で初期化

        // 上に見えるマスの数を数える
        for (int i = x - 2, j = y - 1; i >= 0 && s[i].charAt(j) != '#'; i--) {
            ans++;
        }
        // 下に見えるマスの数を数える
        for (int i = x, j = y - 1; i < h && s[i].charAt(j) != '#'; i++) {
            ans++;
        }
        // 左に見えるマスの数を数える
        for (int i = x - 1, j = y - 2; j >= 0 && s[i].charAt(j) != '#'; j--) {
            ans++;
        }
        // 右に見えるマスの数を数える
        for (int i = x - 1, j = y; j < w && s[i].charAt(j) != '#'; j++) {
            ans++;
        }

        System.out.println(ans);

        sc.close();
    }
}
