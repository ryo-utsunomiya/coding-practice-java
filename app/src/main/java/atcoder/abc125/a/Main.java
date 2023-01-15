package atcoder.abc125.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < t + 0.5; i++) {
            if (i % a == 0) {
                sum += b;
//                System.out.printf("i=%d sum=%d\n", i, sum);
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
