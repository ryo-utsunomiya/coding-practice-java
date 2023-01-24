package atcoder.abc165.b;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        BigDecimal x = sc.nextBigDecimal();
        BigDecimal n = BigDecimal.valueOf(100);
        int year = 0;
        while (n.compareTo(x) < 0) {
            n = n.add(n.divide(BigDecimal.valueOf(100), RoundingMode.FLOOR));
            year++;
        }
        System.out.println(year);

        sc.close();
    }
}
