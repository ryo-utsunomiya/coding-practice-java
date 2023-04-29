package atcoder.abc218.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(s.charAt(n - 1) == 'o' ? "Yes" : "No");

        sc.close();
    }
}
