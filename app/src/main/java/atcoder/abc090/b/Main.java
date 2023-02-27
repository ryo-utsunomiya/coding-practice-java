package atcoder.abc090.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;
        for (int i = a; i <= b; i++) {
            // a, b の制約によってiは5桁であることが保証されているので、
            // 一の位と万の位、十の位と千の位の値が等しいことを確かめる
            int s = i % 10; // 一の位
            int t = i / 10 % 10; // 十の位
            int u = i / 1000 % 10; // 千の位
            int v = i / 10000 % 10; // 万の位
            if (s == v && t == u) {
                answer++;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
