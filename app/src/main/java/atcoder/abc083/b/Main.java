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
            int sumDigits = sumDigits(i);
            if (a <= sumDigits && sumDigits <= b) {
                ans += i;
            }
        }
        System.out.println(ans);

        sc.close();
    }

    static int sumDigits(int n) {
        int sum = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
