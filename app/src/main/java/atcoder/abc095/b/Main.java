package atcoder.abc095.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n+1];
        int answer = n;
        int min = 1000;

        for (int i = 1; i <= n; i++) {
            m[i] = sc.nextInt();
            x -= m[i];
            min = Math.min(m[i], min);
        }

        answer += x / min;

        System.out.println(answer);

        sc.close();
    }
}
