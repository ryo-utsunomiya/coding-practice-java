package atcoder.abc164.c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] items = new String[n];
        for (int i = 0; i < n; i++) {
            items[i] = sc.next();
        }

        var itemSet = new HashSet<>(Arrays.asList(items));
        System.out.println(itemSet.size());

        sc.close();
    }
}
