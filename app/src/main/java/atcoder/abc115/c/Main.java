package atcoder.abc115.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i+k-1 < n; i++) {
            answer = Math.min(h[i+k-1] - h[i], answer);
        }
        System.out.println(answer);

        sc.close();
    }
}
