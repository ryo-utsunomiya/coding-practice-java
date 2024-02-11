package atcoder.abc155.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("No");
        } else if (a != b && b != c && c != a) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        sc.close();
    }
}
