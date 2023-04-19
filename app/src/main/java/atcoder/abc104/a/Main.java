package atcoder.abc104.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int r = sc.nextInt();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }

        sc.close();
    }
}
