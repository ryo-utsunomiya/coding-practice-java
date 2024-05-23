package atcoder.abc054.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); // 頂点の数
        int m = sc.nextInt(); // 辺の数
        var g = new ArrayList<List<Integer>>(n);
        for (int i = 0; i < n; i++) {
            g.add(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 0始まりにする
            a--;
            b--;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        sc.close();

        var visited = new HashMap<Integer, Boolean>();
        for (int i = 0; i < n; i++) {
            visited.put(i, false);
        }
        visited.put(0, true);

        int ans = dfs(0, n, g, visited);
        System.out.println(ans);
    }

    static int dfs(int v, int n, List<List<Integer>> g, Map<Integer, Boolean> visited) {
        boolean allVisited = true;
        for (int i = 0; i < n; i++) {
            if (!visited.get(i)) {
                allVisited = false;
                break;
            }
        }
        if (allVisited) {
            return 1;
        }

        int ret = 0;

        for (int i = 0; i < n; i++) {
            if (!g.get(v).contains(i)) {
                continue;
            }
            if (visited.get(i)) {
                continue;
            }

            visited.put(i, true);
            ret += dfs(i, n, g, visited);
            visited.put(i, false);
        }

        return ret;
    }
}
