package atcoder.abc064.a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        int n = 100 * r + 10 * g + b;
        if (n % 4 == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        sc.close();
    }
}
