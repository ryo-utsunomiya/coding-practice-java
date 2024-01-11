package atcoder.abc049.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] c = new String[h];
        for (int i = 0; i < h; i++) {
            c[i] = sc.next();
        }

        for (String row : c) {
            System.out.println(row);
            System.out.println(row);
        }

        sc.close();
    }
}
