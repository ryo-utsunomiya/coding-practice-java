package atcoder.abc116.b;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.close();

        var nums = new HashSet<Integer>();
        int ai = s;
        nums.add(ai);
        int m = 0;
        for (int i = 2; i <= 1000000; i++) {
            ai = f(ai);
            if (!nums.add(ai)) {
                m = i;
                break;
            }
        }
        System.out.println(m);
    }

    static int f(int n) {
        if (n % 2 == 0) {
            return n/2;
        } else {
            return 3 * n + 1;
        }
    }
}
