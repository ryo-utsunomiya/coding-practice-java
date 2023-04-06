package atcoder.abc115.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);
        p[n-1] = p[n-1]/2;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += p[i];
        }
        System.out.println(answer);

        sc.close();
    }
}
