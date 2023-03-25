package atcoder.abc201.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Mountain> mountains = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            var mountain = new Mountain();
            mountain.name = sc.next();
            mountain.height = sc.nextInt();
            mountains.add(mountain);
        }
        mountains.sort((a, b) -> b.height - a.height);

        System.out.println(mountains.get(1).name);

        sc.close();
    }

    static class Mountain {
        String name;
        int height;
    }
}
