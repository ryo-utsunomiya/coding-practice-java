package atcoder.abc054.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray();
        }
        char[][] b = new char[m][m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.next().toCharArray();
        }
        sc.close();

        String ans = "No";

        loop:
        for (int a_i = 0; a_i <= n - m; a_i++) {
            for (int a_j = 0; a_j <= n - m; a_j++) {
                boolean ok = true;
                inner_loop:
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        if (a[i + a_i][j + a_j] != b[i][j]) {
                            ok = false;
                            break inner_loop;
                        }
                    }
                }
                if (ok) {
                    ans = "Yes";
                    break loop;
                }
            }
        }

        System.out.println(ans);
    }
}
