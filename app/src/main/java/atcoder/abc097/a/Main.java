package atcoder.abc097.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String ans = "No";
        if (Math.abs(a - c) <= d) {
            ans = "Yes";
        } else if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
            ans = "Yes";
        }
        System.out.println(ans);

        sc.close();
    }
}
