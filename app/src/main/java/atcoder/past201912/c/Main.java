package atcoder.past201912.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        System.out.println(a[3]);
    }
}
