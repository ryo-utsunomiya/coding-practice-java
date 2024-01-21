package atcoder.abc051.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int k = sc.nextInt();
        int s = sc.nextInt();

        int ans = 0;

        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= k; y++) {
                int z = s - x - y;
                if (0 <= z && z <= k) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
