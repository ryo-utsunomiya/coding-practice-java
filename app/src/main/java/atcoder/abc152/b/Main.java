package atcoder.abc152.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = String.valueOf(a).repeat(b);
        String t = String.valueOf(b).repeat(a);
        if (s.compareTo(t) < 0) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }


        sc.close();
    }
}
