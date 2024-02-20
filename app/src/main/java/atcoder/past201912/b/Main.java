package atcoder.past201912.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 1; i < n; i++) {
            int prev = a[i - 1];
            int curr = a[i];
            if (curr == prev) {
                System.out.println("stay");
            } else if (curr < prev) {
                System.out.printf("down %d\n", prev - curr);
            } else {
                System.out.printf("up %d\n", curr - prev);
            }
        }
    }
}
