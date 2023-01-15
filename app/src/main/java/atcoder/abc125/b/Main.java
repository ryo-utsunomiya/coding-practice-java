package atcoder.abc125.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] values = new int[n];
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }

        int sumProfit = 0;
        for (int i = 0; i < n; i++) {
            int profit = values[i] - costs[i];
            if (profit > 0) {
                sumProfit += profit;
            }
        }
        System.out.println(sumProfit);

        sc.close();
    }
}
