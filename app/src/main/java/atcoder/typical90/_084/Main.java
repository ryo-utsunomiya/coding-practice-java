package atcoder.typical90._084;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        // 区間の総数
        long total = (long) n * (n + 1) / 2;

        // ランレングス圧縮
        var runLengths = new ArrayList<RunLength>();
        for (int i = 0; i < n; ) {
            char c = s.charAt(i);
            var runLength = new RunLength(c, 1);
            int j = i + 1;
            while (j < n && s.charAt(j) == c) {
                runLength.length++;
                j++;
            }
            runLengths.add(runLength);
            i = j;
        }

        // o x のいずれかしか含まない区間の個数を数える
        long ret = 0;
        for (var d : runLengths) {
            ret += (long) d.length * (d.length + 1) / 2;
        }

        // 区間の総数 - o x のいずれかしか含まない区間の個数 が答え
        System.out.println(total - ret);
    }

    static class RunLength {
        char character;
        int length;

        public RunLength(char character, int length) {
            this.character = character;
            this.length = length;
        }
    }
}
