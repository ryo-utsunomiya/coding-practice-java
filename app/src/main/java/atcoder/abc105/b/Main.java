package atcoder.abc105.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        // cake:$4 donut:$7
        int n = sc.nextInt();
        int priceCake = 4;
        int priceDonut = 7;

        int numCakeMax = n / priceCake;
        int numDonutMax = n / priceDonut;

        boolean ans = false;
        for (int numCake = 0; numCake <= numCakeMax; numCake++) {
            for (int numDonut = 0; numDonut <= numDonutMax; numDonut++) {
                int sum = priceCake * numCake + priceDonut * numDonut;
                if (sum == n) {
                    ans = true;
                    break;
                }
            }
        }
        System.out.println(ans ? "Yes" : "No");

        sc.close();
    }
}
