package atcoder.abc169.b;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int N = sc.nextInt();

        BigDecimal[] A = new BigDecimal[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextBigDecimal();
            if (A[i].compareTo(BigDecimal.ZERO) == 0) {
                System.out.println(0);
                return;
            }
        }

        sc.close();

        BigDecimal result = BigDecimal.ONE;
        BigDecimal limit = BigDecimal.TEN.pow(18);
        for (BigDecimal a : A) {
            result = result.multiply(a);
            if (result.compareTo(limit) > 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result);
    }
}
