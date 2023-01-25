package atcoder.abc083.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sumDigit = sumDigit(i);
            if (a <= sumDigit && sumDigit <= b) {
                ans += i;
            }
        }
        System.out.println(ans);

        sc.close();
    }

    static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
