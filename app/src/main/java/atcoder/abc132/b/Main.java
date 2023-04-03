package atcoder.abc132.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i + 1 == n) {
                continue;
            }
            if (p[i-1] < p[i] && p[i] < p[i+1] ||
                p[i-1] > p[i] && p[i] > p[i+1]
            ) {
                answer++;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
