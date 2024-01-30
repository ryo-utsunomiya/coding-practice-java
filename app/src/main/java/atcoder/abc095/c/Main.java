package atcoder.abc095.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int priceA = scanner.nextInt();
        int priceB = scanner.nextInt();
        int priceAB = scanner.nextInt();
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        // ABを一枚も買わないと仮定して計算
        int minSum = numA * priceA + numB * priceB;

        // ABの枚数を増やしていって minSum の最小値を求める
        for (int numAB = 2; numAB <= 200000; numAB += 2) {
            numA = Math.max(numA - 1, 0);
            numB = Math.max(numB - 1, 0);
            int sum = numA * priceA + numB * priceB + numAB * priceAB;
            if (sum < minSum) {
                minSum = sum;
            }
        }

        System.out.println(minSum);

        scanner.close();
    }
}
