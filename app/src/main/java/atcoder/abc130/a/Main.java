package atcoder.abc130.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = sc.nextInt();

        if (x < a) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }

        sc.close();
    }
}
