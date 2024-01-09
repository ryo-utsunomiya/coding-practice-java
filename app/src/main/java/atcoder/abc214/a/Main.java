package atcoder.abc214.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 125) {
            System.out.println(4);
        } else if (n <= 211) {
            System.out.println(6);
        } else {
            System.out.println(8);
        }

        sc.close();
    }
}
