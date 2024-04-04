package atcoder.abc136.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ans = 0;
        while (n > 0) {
            if (String.valueOf(n).length() % 2 != 0) { // 桁数が奇数
                ans++;
            }
            n--;
        }
        System.out.println(ans);
    }
}