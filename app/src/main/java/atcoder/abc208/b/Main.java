package atcoder.abc208.b;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int p = sc.nextInt();
        Deque<Long> coins = new ArrayDeque<>();
        long coin = 1;
        int i = 1;
        while (coin <= p) {
            coin = factorial(i++);
            coins.push(coin);
        }

        int answer = 0;
        coin = coins.pop();
        while (p > 0) {
            if (p >= coin) {
                p -= coin;
                answer++;
            } else {
                coin = coins.pop();
            }
        }
        System.out.println(answer);

        sc.close();
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
