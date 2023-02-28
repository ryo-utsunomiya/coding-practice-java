package atcoder.abc220.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = -1;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
