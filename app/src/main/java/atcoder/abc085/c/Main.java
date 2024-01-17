package atcoder.abc085.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        int x = -1;
        int y = -1;
        int z = -1;

        loop:
        for (int i = N; i >= 0; i--) {
            for (int j = N-i; j >= 0; j--) {
                int k = N - i - j;
                if (k < 0) {
                    continue;
                }
                if (10000 * i + 5000 * j + 1000 * k == Y) {
                    x = i;
                    y = j;
                    z = k;
                    break loop;
                }
            }
        }

        System.out.printf("%d %d %d\n", x, y, z);

        sc.close();
    }
}
