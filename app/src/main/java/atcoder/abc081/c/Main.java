package atcoder.abc081.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // それぞれの整数の個数分布を作る
        Integer[] bucket = new Integer[n + 1];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < n; i++) {
            bucket[a[i]]++;
        }

        // 個数が多い順にソート
        Arrays.sort(bucket, Collections.reverseOrder());

        // 書き換えないボールの個数の最大値を求める
        int numNotModified = 0;
        for (int i = 0; i < k; i++) {
            numNotModified += bucket[i];
        }

        // n から書き換えないボールの個数の最大値を引くと、書き換えの必要なボールの最小値になる
        System.out.println(n - numNotModified);

        sc.close();
    }
}
