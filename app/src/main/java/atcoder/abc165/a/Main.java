package atcoder.abc165.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int largest = (b / k) * k;
        if (a <= largest) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        sc.close();
    }
}
