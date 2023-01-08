package atcoder.abc128.b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Restaurant> restaurants = new ArrayList<>();
        for (int id = 1; id <= n; id++) {
            var r = new Restaurant();
            r.id = id;
            r.city = sc.next();
            r.point = sc.nextInt();
            restaurants.add(r);
        }

        restaurants.stream().sorted((a, b) -> {
            if (a.city.equals(b.city)) {
                return b.point - a.point;
            }
            return a.city.compareTo(b.city);
        }).forEach(r -> System.out.println(r.id));

        sc.close();
    }

    static class Restaurant {
        int id;
        String city;
        int point;
    }
}
