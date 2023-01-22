package atcoder.abc157.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n/2);
        } else {
            System.out.println(n/2 + 1);
        }

        sc.close();
    }
}
