package atcoder.abc086a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b % 2 == 0 ? "Even" : "Odd");

        scanner.close();
    }
}
