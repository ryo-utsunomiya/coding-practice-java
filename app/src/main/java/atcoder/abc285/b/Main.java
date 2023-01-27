package atcoder.abc285.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int i = 1; i < n; i++) {
            int l = n - i; // l <= n - i
            while (l > 0) {
                boolean ok = true;
                for (int k = 1; k <= l; k++) {
                    if (s.charAt(k-1) == s.charAt(k+i-1)) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    break;
                } else {
                    l--;
                }
            }
            System.out.println(l);
        }

        sc.close();
    }
}
