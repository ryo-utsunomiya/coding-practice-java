package atcoder.abc097.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ans = 1;

        for (int b = 1; b <= x; b++) {
            for (int p = 2; p <= x; p++) {
                int n = (int)Math.pow(b, p);
                if (n > x) {
                    break;
                }
                ans = Math.max(ans, n);
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
