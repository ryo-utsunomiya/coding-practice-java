package atcoder.abc095.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int answer = 700;
        for (char c : s.toCharArray()) {
            if (c == 'o') {
                answer += 100;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
