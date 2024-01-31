package atcoder.abc108.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();

        // Kで割り切れる数の個数
        long divisible = N / K;
        // Kで割った余りが K/2 である数の個数（Kが偶数の場合のみ）
        long halfDivisible = K % 2 == 0 ? (N + K / 2) / K : 0;

        long count = 0;

        // a, b, c が全てKで割り切れる場合
        count += divisible * divisible * divisible;
        // a, b, c の各々が K で割った余りが K/2 である場合（Kが偶数の場合のみ）
        count += halfDivisible * halfDivisible * halfDivisible;

        System.out.println(count);
    }
}

