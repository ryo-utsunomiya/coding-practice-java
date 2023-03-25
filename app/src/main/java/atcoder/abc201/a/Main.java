package atcoder.abc201.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a - b == b - c) || // [a,b,c]
            (a - c == c - b) || // [a,c,b]
            (b - a == a - c) || // [b,a,c]
            (b - c == c - a) || // [b,c,a]
            (c - a == a - b) || // [c,a,b]
            (c - b == b - a)    // [c,b,a]
        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
