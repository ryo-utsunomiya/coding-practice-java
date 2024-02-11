package atcoder.abc155.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean ok = true;
        for (int num : a) {
            if (num % 2 == 0 && (num % 3 != 0 && num % 5 != 0)) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "APPROVED" : "DENIED");

        sc.close();
    }
}
