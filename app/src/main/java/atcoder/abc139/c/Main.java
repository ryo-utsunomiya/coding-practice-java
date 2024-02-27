package atcoder.abc139.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.close();

        boolean[] checked = new boolean[n+1]; // performance optimization
        int numMaxMove = 0;
        for (int i = 0; i < n; i++) {
            if (!checked[i]) {
                checked[i] = true;
                for (int j = i + 1; j < n; j++) {
                    if (h[j - 1] < h[j]) {
                        break;
                    }
                    checked[j] = true;
                    numMaxMove = Math.max(numMaxMove, j - i);
                }
            }
        }

        System.out.println(numMaxMove);
    }
}
