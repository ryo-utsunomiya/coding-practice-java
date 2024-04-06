package atcoder.abc136.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length();
        int[] children = new int[n];

        for (int i = 0; i < n; ) {
            // R の区間を飛ばす
            int j = i;
            while (j < n && s.charAt(j) == 'R') {
                j++;
            }

            // Lの区間を飛ばす
            int l = j;
            while (l < n && s.charAt(l) == 'L') {
                l++;
            }

            int lenR = j - i;
            int lenL = l - j;

            // RにはRから偶数マス離れた子供が集まる
            children[j - 1] = (lenR + 1) / 2 + lenL / 2;

            // LにはLから偶数マス離れた子供が集まる
            children[j] = lenR / 2 + (lenL + 1) / 2;

            i = l;
        }

        var sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(children[i]);
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
