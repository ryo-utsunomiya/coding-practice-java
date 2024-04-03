package atcoder.agc039.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        sc.close();

        long tmpAns = 0;
        for (int i = 0, n = s.length(); i < n; ) {
            int j = i + 1;
            while (j < n && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            int diff = j - i;
            if (diff >= 2) {
                tmpAns += diff / 2;
            }
            i = j;
        }
        System.out.println(tmpAns * k);
    }
}
