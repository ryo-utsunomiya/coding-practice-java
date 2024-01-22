package atcoder.typical90._16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 9999;
        for (int x = 0; x <= 9999; x++) {
            for (int y = 0; y <= 9999; y++) {
                long tmp = (long)x*a + (long)y*b;
                if (n < tmp || (n - tmp) % c != 0) {
                    continue;
                }
                int z = (int)(n - tmp) / c;
                if (ans > x + y + z) {
                    ans = x + y + z;
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
