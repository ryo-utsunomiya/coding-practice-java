package atcoder.abc104.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s) ? "AC" : "WA");

        sc.close();
    }

    static boolean solution(String s) {
        if (s.charAt(0) != 'A') {
            return false;
        }
        if (Character.isUpperCase(s.charAt(1))) {
            return false;
        }

        int n = s.length();
        int numC = 0;
        for (int i = 2; i < n - 1; i++) {
            int c = s.charAt(i);
            if (c == 'C') {
                numC++;
            } else if (Character.isUpperCase(c)) {
                return false;
            }
        }

        if (numC != 1) {
            return false;
        }

        return Character.isLowerCase(s.charAt(n - 1));
    }
}
