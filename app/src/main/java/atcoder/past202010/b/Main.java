package atcoder.past202010.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y == 0) {
            System.out.println("ERROR");
        } else {
            System.out.printf("%.2f", (double)((x*100)/y) / 100);
        }

        sc.close();
    }
}
