package atcoder.abc144.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean ans = false;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (n == i * j) {
                    ans = true;
                    break;
                }
            }
        }
        System.out.println(ans ? "Yes" : "No");

        sc.close();
    }
}
