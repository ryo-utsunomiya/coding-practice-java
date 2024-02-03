package atcoder.abc112.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int timeLimit = scanner.nextInt();
        int[] costs = new int[n];
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = scanner.nextInt();
            times[i] = scanner.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (times[i] <= timeLimit) {
                minCost = Math.min(minCost, costs[i]);
            }
        }
        if (minCost == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(minCost);
        }

        scanner.close();
    }
}
