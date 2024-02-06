package atcoder.abc164.c;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var itemSet = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            itemSet.add(sc.next());
        }
        System.out.println(itemSet.size());

        sc.close();
    }
}
