package atcoder.agc040.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length() + 1;
        int[] a = new int[n]; // 良い非負整数列を格納する配列

        // < のとき、 a[i+1] に a[i] + 1 した値を入れる
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '<') {
                a[i + 1] = a[i] + 1;
            }
        }

        // > は後ろから走査する。
        // > のとき、 a[i] には a[i] か a[i+1] + 1 の大きい方が入る
        for (int i = n - 2; i >= 0 ; i--) {
            if (s.charAt(i) == '>') {
                a[i] = Math.max(a[i], a[i + 1] + 1);
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i];
        }
        System.out.println(ans);
    }
}
