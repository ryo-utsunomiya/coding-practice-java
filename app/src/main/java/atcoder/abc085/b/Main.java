package atcoder.abc085.b;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var d = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            d.add(sc.nextInt());
        }

        System.out.println(d.size());

        sc.close();
    }
}
