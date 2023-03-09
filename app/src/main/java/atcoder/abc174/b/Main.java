package atcoder.abc174.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x * x + y * y <= d * d) {
                answer++;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
