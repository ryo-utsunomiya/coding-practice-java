package atcoder.abc158.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int minPrice = Math.min(a * 13, b * 10);
        int maxPrice = Math.max(a * 13, b * 10);
        int price = minPrice;
        while (price <= maxPrice) {
            int before = (int)Math.floor(price * 0.08);
            int after = (int)Math.floor(price * 0.10);
            if (before == a && after == b) {
                break;
            }
            price++;
        }
        if (price > maxPrice) {
            System.out.println(-1);
        } else {
            System.out.println(price);
        }

        sc.close();
    }
}
