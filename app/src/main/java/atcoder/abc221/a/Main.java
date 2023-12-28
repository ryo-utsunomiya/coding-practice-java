package atcoder.abc221.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        long answer = (long)Math.pow(32, a-b);
        System.out.println(answer);

        sc.close();
    }
}
