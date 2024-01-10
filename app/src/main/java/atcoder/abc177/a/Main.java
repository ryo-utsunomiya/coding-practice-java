package atcoder.abc177.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        System.out.println(s * t >= d ? "Yes" : "No");

        sc.close();
    }
}
