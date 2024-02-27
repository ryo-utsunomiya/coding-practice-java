package atcoder.abc139.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
