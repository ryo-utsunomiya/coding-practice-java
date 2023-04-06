package atcoder.abc115.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int d = sc.nextInt();
        if (d == 25) {
            System.out.println("Christmas");
        } else if (d == 24) {
            System.out.println("Christmas Eve");
        } else if (d == 23) {
            System.out.println("Christmas Eve Eve");
        } else if (d == 22) {
            System.out.println("Christmas Eve Eve Eve");
        }

        sc.close();
    }
}
