package atcoder.past201912.e;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        String[] s = new String[q];
        for (int i = 0; i < q; i++) {
            s[i] = sc.nextLine();
        }
        sc.close();

        var followingMap = new HashMap<Integer, Set<Integer>>();
        for (int i = 1; i <= n; i++) {
            followingMap.put(i, new HashSet<>());
        }

        for (int i = 0; i < q; i++) {
            var parts = s[i].split(" ");
            String operation = parts[0];
            int target = Integer.parseInt(parts[1]);
            var following = followingMap.get(target);
            if (operation.equals("1")) {
                // フォロー
                following.add(Integer.parseInt(parts[2]));
            } else if (operation.equals("2")) {
                // フォロー全返し
                for (int j = 1; j <= n; j++) {
                    if (followingMap.get(j).contains(target)) {
                        following.add(j);
                    }
                }
            } else {
                // フォローフォロー
                for (int x : new ArrayList<>(following)) {
                    following.addAll(followingMap.get(x));
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            var followStatus = new ArrayList<String>(n);
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    followStatus.add("N");
                } else {
                    followStatus.add(followingMap.get(i).contains(j) ? "Y" : "N");
                }
            }
            System.out.println(String.join("", followStatus));
        }
    }
}
