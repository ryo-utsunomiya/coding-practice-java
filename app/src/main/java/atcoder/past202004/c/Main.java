package atcoder.past202004.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 2*n-1;
        char[][] s = new char[n][m];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toCharArray();
        }

        // 右上、右横、右下
        int[] dy = new int[]{1,1,1};
        int[] dx = new int[]{-1,0,1};

        for (int i = n-2; i >= 0; i--) { // n-1, n-2, ..., 1 から -1
            for (int j = 0; j < m; j++) {
                boolean isX = false;
                if (1 <= j && j <= 2*n - 3) { // 2 <= j <= 2*n - 2 から-1
                    if (s[i][j] == '#') {
                        for (int d = 0; d < 3; d++) {
                            int di = dy[d] + i;
                            int dj = dx[d] + j;
                            if (di <= n && dj <= m) {
                                if (s[di][dj] == 'X') {
                                    isX = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (isX) {
                    s[i][j] = 'X';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(new String(s[i]));
        }

        sc.close();
    }
}
