package atcoder.abc286.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        char[] chars = s.toCharArray();

        var sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'n' && i+1 < chars.length && chars[i+1] == 'a') {
                sb.append("ny");
            } else {
                sb.append(chars[i]);
            }
        }

        System.out.println(sb);

        sc.close();
    }
}
