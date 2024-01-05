package atcoder.abc144.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 10 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
