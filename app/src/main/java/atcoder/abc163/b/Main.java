package atcoder.abc163.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int day : a) {
            n -= day;
        }

        if (n >= 0) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }
    }
}
