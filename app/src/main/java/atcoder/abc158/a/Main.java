package atcoder.abc158.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        if (s.equals("AAA") || s.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        sc.close();
    }
}
