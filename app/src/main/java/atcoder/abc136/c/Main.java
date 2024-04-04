package atcoder.abc136.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        boolean ans = true;

        // 右から左に操作を行う
        for (int i = n - 2; i >= 0; i--) {
            if (h[i] > h[i+1]) {
                if (h[i] - h[i+1] == 1) { // 右のマスよりも1つだけ高い時は1つ低くする
                    h[i]--;
                } else { // 2つ以上高い時は単調非減少にできない
                    ans = false;
                    break;
                }
            }
        }

        System.out.println(ans ? "Yes" : "No");
    }
}
