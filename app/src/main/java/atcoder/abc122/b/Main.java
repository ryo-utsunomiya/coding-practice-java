package atcoder.abc122.b;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        var acgt = new HashSet<>(List.of('A', 'C', 'G', 'T'));
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length() && acgt.contains(s.charAt(j))) {
                j++;
            }
            maxLen = Math.max(maxLen, j - i);
        }
        System.out.println(maxLen);
    }
}
