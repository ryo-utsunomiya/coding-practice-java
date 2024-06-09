package atcoder.joi2010ho.a;

/*
 * https://atcoder.jp/contests/joi2010ho/tasks/joi2010ho_a
 *
 * テストデータ

 7 5
 2
 1
 1
 3
 2
 1
 2
 -1
 3
 2
 -3

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 宿場町の個数
        int m = scanner.nextInt(); // 旅の日数
        int[] distances = new int[n];
        for (int i = 0; i < n - 1; i++) {
            distances[i] = scanner.nextInt();
        }
        int[] a = new int[m]; // 移動する宿場町の個数
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        // 宿場町の距離の累積和
        int[] cs = new int[n + 1];
        cs[0] = 0;
        for (int i = 0; i < n; i++) {
            cs[i + 1] = cs[i] + distances[i];
        }

        long sumDistances = 0;
        int current = 0;
        for (int i = 0; i < m; i++) {
            int next = current + a[i];
            if (next > current) {
                // 進む
                sumDistances = sumDistances + cs[next] - cs[current];
            } else {
                // 戻る
                sumDistances = sumDistances + cs[current] - cs[next];
            }
            current = next;
        }
        System.out.println(sumDistances % 100000);
    }
}
