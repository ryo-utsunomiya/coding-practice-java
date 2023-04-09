package atcoder.abc113.c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        var allCities = new ArrayList<City>();
        for (int i = 1; i <= m; i++) {
            int prefecture = sc.nextInt();
            int birthYear = sc.nextInt();

            var city = new City();
            city.serial = i;
            city.prefecture = prefecture;
            city.birthYear = birthYear;
            allCities.add(city);
        }

        var prefectureToCities = allCities.stream()
                .collect(Collectors.groupingBy(city -> city.prefecture, Collectors.toList()));
        for (int prefecture = 1; prefecture <= n; prefecture++) {
            var cities = prefectureToCities.get(prefecture);
            if (cities != null) {
                int birthOrder = 1;
                cities.sort(Comparator.comparing(city -> city.birthYear));
                for (var city : cities) {
                    city.birthOrder = birthOrder++;
                }
            }
        }

        allCities.sort(Comparator.comparing(city -> city.serial));
        for (var city : allCities) {
            System.out.println(city.getId());
        }

        sc.close();
    }

    static class City {
        int prefecture;
        int birthYear;
        int birthOrder;
        int serial;

        public String getId() {
            return String.format("%06d%06d", prefecture, birthOrder);
        }
    }
}
