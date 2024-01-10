package atcoder.abc177.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        // Sの中でTと異なる文字数が最も少ない部分を探す
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < s.length() - t.length(); i++) {
            // 異なる文字数を数える
            int diff = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    diff++;
                }
            }
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println(minDiff);

        sc.close();
    }
}
