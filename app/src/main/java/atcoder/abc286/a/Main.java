package atcoder.abc286.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt() - 1;
        int q = sc.nextInt() - 1;
        int r = sc.nextInt() - 1;
        int s = sc.nextInt() - 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = p, k = r; j <= q; j++, k++) {
            int tmp = a[j];
            a[j] = a[k];
            a[k] = tmp;
        }

        var sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.toString().trim());

        sc.close();
    }
}
