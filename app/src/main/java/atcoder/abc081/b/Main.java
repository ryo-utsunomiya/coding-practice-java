package atcoder.abc081.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int answer = 0;
        boolean modified;
        do {
            modified = false;
            boolean haveOddNumber = false;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    haveOddNumber = true;
                    break;
                }
            }
            if (!haveOddNumber) {
                for (int i = 0; i < n; i++) {
                    a[i] /= 2;
                }
                modified = true;
                answer++;
            }
        } while(modified);

        System.out.println(answer);

        sc.close();
    }
}
