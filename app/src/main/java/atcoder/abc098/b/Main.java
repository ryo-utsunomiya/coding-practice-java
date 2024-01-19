package atcoder.abc098.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;
        for (int i = 1; i < n; i++) {
            String x = s.substring(0,i);
            String y = s.substring(i);
            var xCharSet = toCharSet(x);
            var yCharSet = toCharSet(y);
            xCharSet.retainAll(yCharSet);
            ans = Math.max(xCharSet.size(), ans);
        }
        System.out.println(ans);

        sc.close();
    }

    static Set<Character> toCharSet(String s) {
        var set = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set;
    }
}
