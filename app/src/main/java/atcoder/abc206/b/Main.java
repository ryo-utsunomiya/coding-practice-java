package atcoder.abc206.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; ;i++) {
            n -= i;
            if (n <= 0) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
