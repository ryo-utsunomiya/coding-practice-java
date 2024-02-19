package atcoder.typical90._046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        sc.close();

        long ans = 0;

        // 以下は O(N^2) なのでTLE
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < n; k++) {
//                    if ((a[i] + b[j] + c[k]) % 46 == 0) {
//                        ans++;
//                    }
//                }
//            }
//        }

        // それぞれの配列の要素を余りによって分類し数える
        int[] aRemainderCounts = new int[46];
        int[] bRemainderCounts = new int[46];
        int[] cRemainderCounts = new int[46];
        for (int i = 0; i < n; i++) {
            aRemainderCounts[ a[i] % 46 ]++;
            bRemainderCounts[ b[i] % 46 ]++;
            cRemainderCounts[ c[i] % 46 ]++;
        }

        // 余りの和が 46 の倍数であるとき、該当する数が a, b, cに何個含まれるか調べる
        for (int x = 0; x < 46; x++) {
            for (int y = 0; y < 46; y++) {
                for (int z = 0; z < 46; z++) {
                    if ((x + y + z) % 46 == 0) {
                        int ax = aRemainderCounts[x];
                        int by = bRemainderCounts[y];
                        int cz = cRemainderCounts[z];
                        ans += (long)ax * by * cz;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
