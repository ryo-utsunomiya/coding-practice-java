package atcoder.agc026.a;

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

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && a[j] == a[i]) {
                j++;
            }
            int numSameColorSlimes = j - i;
            if (numSameColorSlimes % 2 == 0) {
                ans += numSameColorSlimes / 2;
            } else {
                ans += (numSameColorSlimes - 1) / 2;
            }
            i = j - 1;
        }

        System.out.println(ans);
    }
}
