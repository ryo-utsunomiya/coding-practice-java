package atcoder.abc098.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        int[] csw = new int[n + 1]; // 西を向いている人の数の累積和
        csw[0] = 0;
        for (int i = 0; i < n; i++) {
            csw[i + 1] = csw[i] + ('W' == s.charAt(i) ? 1 : 0);
        }

        int[] cse = new int[n + 1]; // 東を向いている人の数の累積和
        cse[0] = 0;
        for (int i = 0; i < n; i++) {
            cse[i + 1] = cse[i] + ('E' == s.charAt(i) ? 1 : 0);
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // i より西にいる西向きの人は東に向ける
            int numWest = csw[i];
            // i より東にいる東向きの人は西に向ける
            int numEast = cse[n] - cse[i + 1];
            // i 番目の人をリーダーにした時に向きを変える必要のある人数を求める
            int numChanges = numWest + numEast;
            minChanges = Math.min(minChanges, numChanges);
        }
        System.out.println(minChanges);
    }
}
