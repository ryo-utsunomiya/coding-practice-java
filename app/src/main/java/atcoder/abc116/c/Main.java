package atcoder.abc116.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] targetHeights = new int[n];
        for (int i = 0; i < n; i++) {
            targetHeights[i] = sc.nextInt();
        }
        sc.close();

        int[] currentHeights = new int[n];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            while (currentHeights[i] < targetHeights[i]) {
                for (int j = i; j < n && currentHeights[j] < targetHeights[j]; j++) {
                    currentHeights[j]++;
                }
                ans++;
            }
        }
        System.out.println(ans);
    }
}
