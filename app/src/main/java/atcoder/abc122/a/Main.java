package atcoder.abc122.a;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String b = scanner.next();
        scanner.close();

        var map = Map.of(
                "A", "T",
                "T", "A",
                "C", "G",
                "G", "C"
        );
        System.out.println(map.get(b));
    }
}
