package atcoder.abc200.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        long n = sc.nextLong();
        int k = sc.nextInt();

        while (k > 0) {
            if (n % 200 == 0) {
                n /= 200;
            } else {
                n = n * 1000 + 200;
            }
            k--;
        }
        System.out.println(n);

        sc.close();
    }
}
