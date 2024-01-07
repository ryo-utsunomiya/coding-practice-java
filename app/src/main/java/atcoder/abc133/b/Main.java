package atcoder.abc133.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int distance = 0;
                for (int k = 0; k < d; k++) {
                    int diff = Math.abs(x[i][k] - x[j][k]);
                    distance += diff * diff;
                }

                if (isInteger(distance)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }

    private static boolean isInteger(int n) {
        double lim = Math.sqrt(n);
        for (int i = 0; i <= lim; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
}
