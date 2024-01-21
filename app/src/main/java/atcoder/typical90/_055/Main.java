package atcoder.typical90._055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    for (int l = 0; l < k; l++) {
                        for (int m = 0; m < l; m++) {
                            // a[i] <= 10^9 のため、全ての数の積はint（10桁）、long(19桁)の範囲に収まらない
                            // そこで、先に割って余りにかける方式で余りを計算する
                            // 参考: https://math.nakaken88.com/textbook/cp-remainder/
                            if ((long)a[i] % p * a[j] % p * a[k] % p * a[l] % p * a[m] % p == q) {
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
