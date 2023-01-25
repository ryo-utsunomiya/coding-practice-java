package atcoder.abc083.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int l = a + b;
        int r = c + d;
        if (l > r) {
            System.out.println("Left");
        } else if (l == r) {
            System.out.println("Balanced");
        } else {
            System.out.println("Right");
        }

        sc.close();
    }
}
