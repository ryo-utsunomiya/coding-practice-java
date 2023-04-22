package atcoder.abc146.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (char c : s.toCharArray()) {
            System.out.print(rotN(c, n));
        }

        sc.close();
    }

    static char rotN(char c, int n) {
        char newC = (char) (c + (char)n);
        if (newC > 'Z') {
            newC = (char) (newC - 26);
        }
        return newC;
    }
}
