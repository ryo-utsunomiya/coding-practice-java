package atcoder.abc173.a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = n % 1000;
        if (r == 0) {
            System.out.println(0);
        } else {
            System.out.println(1000 - r);
        }

        sc.close();
    }
}
