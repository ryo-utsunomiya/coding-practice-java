package atcoder.abc093.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i < a + k) {
                System.out.println(i);
            } else if (b - k < i) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
