package atcoder.abc090.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String[] c = new String[3];
        for (int i = 0; i < 3; i++) {
            c[i] = sc.next();
        }
        System.out.print(c[0].charAt(0));
        System.out.print(c[1].charAt(1));
        System.out.print(c[2].charAt(2));

        sc.close();
    }
}
