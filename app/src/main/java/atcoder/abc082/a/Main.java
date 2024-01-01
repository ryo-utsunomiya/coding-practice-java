package atcoder.abc082.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = (int)Math.ceil((double)(a+b)/2);
        System.out.println(x);

        sc.close();
    }
}
