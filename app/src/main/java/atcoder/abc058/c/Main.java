package atcoder.abc058.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        sc.close();

        // それぞれの文字が何回出現するか記録する配列 0=a, 1=b, ..., 25=z
        var minCharCounts = new int[26];
        Arrays.fill(minCharCounts, Integer.MAX_VALUE);

        for (String str : strings) {
            var charCounts = new int[26];
            Arrays.fill(charCounts, 0);
            for (char c : str.toCharArray()) {
                charCounts[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minCharCounts[i] = Math.min(minCharCounts[i], charCounts[i]);
            }
        }

        var sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char)((int)'a' + i);
            sb.append(String.valueOf(c).repeat(minCharCounts[i]));
        }
        System.out.println(sb);
    }
}
