package atcoder.abc204.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 10) {
                sum += a[i] - 10;
            }
        }

        System.out.println(sum);
    }
}
