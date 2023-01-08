package atcoder.abc128.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int p = sc.nextInt();
        p += a * 3;
        System.out.println(p / 2);

        sc.close();
    }
}
