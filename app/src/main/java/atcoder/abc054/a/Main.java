package atcoder.abc054.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a == 1) {
            a += 13;
        }
        if (b == 1) {
            b += 13;
        }

        if (a > b) {
            System.out.println("Alice");
        } else if (a < b) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");

        }
    }
}
