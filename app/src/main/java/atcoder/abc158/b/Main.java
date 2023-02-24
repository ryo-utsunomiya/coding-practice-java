package atcoder.abc158.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        long n = sc.nextLong();
        long blue = sc.nextLong();
        long red = sc.nextLong();

        if (blue == 0) {
            System.out.println(0);
        } else if (red == 0) {
            System.out.println(n);
        } else {
            long d = n / (blue + red);
            long r = n % (blue + red);
            long numBlues = (d * blue) + Math.min(r, blue);
            System.out.println(numBlues);
        }

        sc.close();
    }
}
