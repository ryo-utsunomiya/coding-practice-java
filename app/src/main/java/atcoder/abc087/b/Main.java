package atcoder.abc087.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt(); // 500円玉の枚数
        int b = sc.nextInt(); // 100円玉の枚数
        int c = sc.nextInt(); //  50円玉の枚数
        int x = sc.nextInt(); // 目標金額

        int ans = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int sum = 500 * i + 100 * j + 50 * k;
                    if (sum == x) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
