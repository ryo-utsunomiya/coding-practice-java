package atcoder.abc088.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alice += a[i];
            } else {
                bob += a[i];
            }
        }

        System.out.println(alice - bob);

        sc.close();
    }
}