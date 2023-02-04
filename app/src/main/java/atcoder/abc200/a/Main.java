package atcoder.abc200.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();

        int c = (n+99) / 100;
        System.out.println(c);

        sc.close();
    }
}
