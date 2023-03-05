package atcoder.abc081.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int answer = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                answer++;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
