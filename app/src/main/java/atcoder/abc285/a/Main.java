package atcoder.abc285.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b/2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
