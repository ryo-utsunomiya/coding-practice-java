package atcoder.abc166.b;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        var ownerToSnacks = new HashMap<Integer, Set<Integer>>();

        for (int snack = 1; snack <= k; snack++) {
            int numOwners = sc.nextInt();
            for (int j = 0; j < numOwners; j++) {
                int owner = sc.nextInt();
                var snacks = ownerToSnacks.getOrDefault(owner, new HashSet<>());
                snacks.add(snack);
                ownerToSnacks.put(owner, snacks);
            }
        }

        sc.close();

        int ans = 0;
        for (int owner = 1; owner <= n; owner++) {
            var snacks = ownerToSnacks.get(owner);
            if (snacks == null || snacks.isEmpty()) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
