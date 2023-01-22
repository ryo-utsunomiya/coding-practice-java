package atcoder.abc176.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
//            System.out.printf("c=%s sum=%d\n", c, sum);
        }

        if (sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
