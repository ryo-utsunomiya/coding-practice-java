package atcoder.abc176.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        int ans;
        if (n % x == 0) {
            ans = t * (n / x);
        } else {
            ans = t * ((n / x) + 1);
        }
        System.out.println(ans);

        sc.close();
    }
}
