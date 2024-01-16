package atcoder.past202004.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(Math.abs(parseFloor(s) - parseFloor(t)));

        sc.close();
    }

    static int parseFloor(String s) {
        if (s.startsWith("B")) {
            int n = Integer.parseInt(s.substring(1));
            return -n;
        } else {
            int n = Integer.parseInt(s.substring(0,1));
            return n-1;
        }
    }
}
