package atcoder.abc118.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> foodToCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int food = sc.nextInt();
                foodToCount.put(food, foodToCount.getOrDefault(food, 0) + 1);
            }
        }

        long ans = foodToCount.values()
            .stream()
            .filter(count -> count == n)
            .count();
        System.out.println(ans);

        sc.close();
    }
}
