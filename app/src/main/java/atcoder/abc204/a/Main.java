package atcoder.abc204.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        scanner.close();

        if (x.equals(y)) {
            // 全員同じ手
            System.out.println(x);
        } else {
            // 全員違う手
            var hands = new ArrayList<>(List.of("0", "1", "2"));
            hands.remove(x);
            hands.remove(y);
            System.out.println(hands.stream().findFirst().orElseThrow());
        }
    }
}
