package atcoder.abc113.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n+1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }

        double minDiff = Double.MAX_VALUE;
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            int x = h[i];
            double temperature = t - (x * 0.006);
            double diff = Math.abs(a - temperature);
            if (diff < minDiff) {
                minDiff = diff;
                answer = i;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
