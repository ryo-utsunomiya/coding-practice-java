package atcoder.abc205.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        boolean answer = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != i+1) {
                answer = false;
                break;
            }
        }
        System.out.println(answer ? "Yes" : "No");

        sc.close();
    }
}
