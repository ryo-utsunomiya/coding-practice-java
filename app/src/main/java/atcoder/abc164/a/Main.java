package atcoder.abc164.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int s = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(w >= s ? "unsafe" : "safe");

        sc.close();
    }
}
