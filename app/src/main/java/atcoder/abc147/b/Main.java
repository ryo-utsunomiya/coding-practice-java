package atcoder.abc147.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int differences = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                differences++;
            }
        }
        System.out.println(differences / 2);

        sc.close();
    }
}
