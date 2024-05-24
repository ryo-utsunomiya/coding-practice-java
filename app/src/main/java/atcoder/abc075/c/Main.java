package atcoder.abc075.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 頂点の数
        int m = scanner.nextInt(); // 辺の数
        int[] a = new int[m]; // 辺
        int[] b = new int[m]; // 辺
        var graph = new ArrayList<Set<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt() - 1;
            b[i] = scanner.nextInt() - 1;
            graph.get(a[i]).add(b[i]);
            graph.get(b[i]).add(a[i]);
        }
        scanner.close();

        int numBridges = 0;

        for (int i = 0; i < m; i++) {
            // それぞれの辺を取り除いてみて、非連結になるか確認する
            graph.get(a[i]).remove(b[i]);
            graph.get(b[i]).remove(a[i]);
            var visited = new HashSet<Integer>();
            dfs(0, n, graph, visited);
            if (visited.size() < n) {
                // 全ての頂点を訪問できなかったので、i番目の辺は橋
                numBridges++;
            }
            // 辺を戻す
            graph.get(a[i]).add(b[i]);
            graph.get(b[i]).add(a[i]);
        }

        System.out.println(numBridges);
    }

    static void dfs(int current, int n, List<Set<Integer>> g, Set<Integer> visited) {
        if (visited.contains(current)) {
            return;
        }

        visited.add(current);

        for (int next : g.get(current)) {
            dfs(next, n, g, visited);
        }
    }
}
