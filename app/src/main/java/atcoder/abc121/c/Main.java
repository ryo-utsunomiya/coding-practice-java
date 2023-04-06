package atcoder.abc121.c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        var shops = new ArrayList<Shop>();
        for (int i = 0; i < n; i++) {
            var shop = new Shop();
            shop.price = sc.nextInt();
            shop.stock = sc.nextInt();
            shops.add(shop);
        }

        shops.sort(Comparator.comparingInt(a -> a.price));

        long answer = 0;
        while (m > 0) {
            var shop = shops.get(0);
            answer += shop.price;
            shop.stock--;
            if (shop.stock == 0) {
                shops.remove(0);
            }
            m--;
        }
        System.out.println(answer);

        sc.close();
    }

    static class Shop {
        int price;
        int stock;
    }
}
