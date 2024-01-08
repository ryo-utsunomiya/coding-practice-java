package atcoder.abc175.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) {
                        continue;
                    }
                    // the sum of the lengths of any two sides of a triangle must be
                    // greater than the length of the third side
                    // i.e., a + b > c && a + c > b && b + c > a
                    if (
                            l[i] + l[k] > l[j]
                            && l[i] + l[j] > l[k]
                            && l[j] + l[k] > l[i]
                    ) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
