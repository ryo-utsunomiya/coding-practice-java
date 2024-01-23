package atcoder.abc157.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] S = new int[m];
        int[] C = new int[m];
        for (int i = 0; i < m; i++) {
            S[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        int ans = -1;

        for (int cur = 0; cur < Math.pow(10, n); cur++) {
            String s = String.valueOf(cur);
            if (s.length() < n) {
                continue;
            } else if (s.length() > n) {
                break;
            }

            boolean isAns = true;
            for (int i = 0; i < m; i++) {
                char c = s.charAt(S[i]-1);
                if (c != C[i] + '0') {
                    isAns = false;
                    break;
                }
            }
            if (isAns) {
                ans = cur;
                break;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
