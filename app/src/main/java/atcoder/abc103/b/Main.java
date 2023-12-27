package atcoder.abc103.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        boolean ans = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.equals(t)) {
                ans = true;
                break;
            }
            s = s.charAt(s.length() - 1) + s.substring(0, s.length()-1);
        }
        System.out.println(ans ? "Yes" : "No");

        sc.close();
    }
}
