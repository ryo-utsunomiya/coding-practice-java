package atcoder.abc204.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 都市の数
        int m = scanner.nextInt(); // 道路の数

        // 都市と道路のつながりのグラフ
        var g = new ArrayList<Set<Integer>>();
        for (int i = 0; i < n; i++) {
            g.add(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            // 0始まりにする
            a--;
            b--;
            g.get(a).add(b);
        }
        scanner.close();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            var visited = new HashSet<Integer>();
            dfs(i, n, g, visited);
            answer += visited.size();
        }
        System.out.println(answer);
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
