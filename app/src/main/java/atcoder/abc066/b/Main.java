package atcoder.abc066.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        do {
            s = s.substring(0, s.length() - 1);
        } while(!isEvenString(s));

        System.out.println(s.length());

        sc.close();
    }

    static boolean isEvenString(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        String front = s.substring(0, len/2 - 1);
        String back = s.substring(len/2, len-1);
        return front.equals(back);
    }
}
