package atcoder.abc163.c;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        var bossToSubs = new HashMap<Integer, HashSet<Integer>>();
        bossToSubs.put(1, new HashSet<>());
        for (int sub = 2; sub <= n; sub++) {
            int boss = sc.nextInt();
            var subs = bossToSubs.getOrDefault(boss, new HashSet<>());
            subs.add(sub);
            bossToSubs.put(boss, subs);
        }
        sc.close();

        for (int empNo = 1; empNo <= n; empNo++) {
            var subs = bossToSubs.get(empNo);
            if (subs == null) {
                System.out.println(0);
            } else {
                System.out.println(subs.size());
            }
        }
    }
}
