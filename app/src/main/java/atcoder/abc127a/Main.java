package atcoder.abc127a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A <= 5) {
                System.out.println(0);
            } else if (A <= 12) {
                System.out.println(B/2);
            } else {
                System.out.println(B);
            }
        }
    }
}
