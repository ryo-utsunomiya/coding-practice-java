package atcoder.abc079.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int a = s.charAt(0) - '0';
        int b = s.charAt(1) - '0';
        int c = s.charAt(2) - '0';
        int d = s.charAt(3) - '0';

        char[] ops = new char[]{'+', '-'};

        String ans = "";
        loop:
        for (char op1 : ops) {
            for (char op2 : ops) {
                for (char op3 : ops) {
                    int sum = apply(op3, apply(op2, apply(op1, a, b), c), d);
                    if (sum == 7) {
                        ans = String.format("%d%s%d%s%d%s%d=7", a, op1, b, op2, c, op3, d);
                        break loop;
                    }
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }

    private static int apply(char op, int left, int right) {
        if (op == '+') {
            return left + right;
        } else {
            return left - right;
        }
    }
}
