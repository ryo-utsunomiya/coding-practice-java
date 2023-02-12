package atcoder.abc164.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = (a + d - 1) / d;
        int y = (c + b - 1) / b;
        System.out.println(x >= y ? "Yes" : "No");

        sc.close();
    }
}
