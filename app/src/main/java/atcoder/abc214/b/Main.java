package atcoder.abc214.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int s = sc.nextInt();
        int t = sc.nextInt();

        int ans = 0;
        for (int a = 0; a <= s; a++) {
            for (int b = 0; b <= s; b++) {
                for (int c = 0; c <= s; c++) {
                    if (a + b + c <= s && a * b * c <= t) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
