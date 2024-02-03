package atcoder.abc112.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        sc.close();

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                Integer H = null;
                for (int i = 0; i < N; i++) {
                    if (h[i] > 0) { // 高さが正の点を基準にする
                        int tempH = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                        if (H == null) {
                            H = tempH;
                        } else if (!H.equals(tempH)) {
                            H = null; // 矛盾があればこの点は中心ではない
                            break;
                        }
                    }
                }
                if (H != null) {
                    // 全ての点で矛盾がないか確認
                    boolean isValid = true;
                    for (int i = 0; i < N; i++) {
                        int expectedH = Math.max(H - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0);
                        if (expectedH != h[i]) {
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid) {
                        System.out.println(cx + " " + cy + " " + H);
                        return;
                    }
                }
            }
        }
    }
}

