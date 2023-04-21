package atcoder.abc084.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        System.out.println(solution(s, a, b) ? "Yes" : "No");

        sc.close();
    }

    static boolean solution(String s, int a, int b) {
        if (s.length() != a + b + 1) {
            return false;
        }

        for (int i = 0; i < a; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        if (s.charAt(a) != '-') {
            return false;
        }
        for (int i = a + 1; i < a + 1 + b; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
