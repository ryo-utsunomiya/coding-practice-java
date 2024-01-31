package atcoder.abc108.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int k = sc.nextInt();
        int ans = 0;
        for (int odd = 1; odd <= k; odd += 2) {
            for (int even = 2; even <= k; even += 2) {
                ans++;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
