package atcoder.abc058.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String o = sc.next();
        String e = sc.next();

        int i = 0;
        for (; i < e.length(); i++) {
            System.out.print(o.charAt(i));
            System.out.print(e.charAt(i));
        }
        if (o.length() > e.length()) {
            System.out.println(o.charAt(o.length() - 1));
        }

        sc.close();
    }
}
