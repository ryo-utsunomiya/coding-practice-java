package atcoder.abc221.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        boolean ans = s.equals(t);

        if (!ans) {
            for (int i = 0; i+1 < s.length(); i++) {
                String newS = s.substring(0, i) + s.charAt(i+1) + s.charAt(i) + s.substring(i+2);
                if (newS.equals(t)) {
                    ans = true;
                    break;
                }
            }
        }

        System.out.println(ans ? "Yes" : "No");

        sc.close();
    }
}
