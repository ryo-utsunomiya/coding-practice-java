package atcoder.typical90._076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solution(n, a) ? "Yes" : "No");

        sc.close();
    }

    private static boolean solution(int n, int[] a) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        if (sum % 10 != 0) {
            return false;
        }

        int[] b = new int[2 * n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
            b[i + n] = a[i];
        }

        for (int i = 0; i < n; i++) {
            long target = sum / 10;
            target -= b[i];
            for (int j = i + 1; j < i + n; j++) {
                if (target == 0) {
                    return true;
                } else if (target > 0) {
                    target -= b[j];
                } else {
                    break;
                }
            }
        }
        return false;
    }
}

