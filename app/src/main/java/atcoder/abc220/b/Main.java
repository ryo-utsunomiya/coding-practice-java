package atcoder.abc220.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int k = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        long answer = baseConvert(k, a) * baseConvert(k, b);
        System.out.println(answer);

        sc.close();
    }

    static long baseConvert(int k, String n) {
        long result = 0;
        int base = 1;
        char[] chars = n.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result += (long)(chars[i] - '0') * base;
            base *= k;
        }
        return result;
    }
}
