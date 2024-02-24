package atcoder.abc019.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        var sb = new StringBuilder();

        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            int count = 1;
            int j = i + 1;
            while (j < len && s.charAt(j) == c) {
                j++;
                count++;
            }
            sb.append(c).append(count);
            i = j - 1;
        }

        System.out.println(sb);
    }
}
