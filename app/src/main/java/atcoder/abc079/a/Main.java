package atcoder.abc079.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String n = sc.next();

        int numSameChars = 1;
        Character prev = null;
        boolean ans = false;

        for (char c : n.toCharArray()) {
            if (prev != null) {
                if (c == prev) {
                    numSameChars++;
                    if (numSameChars >= 3) {
                        ans = true;
                    }
                } else {
                    numSameChars = 1;
                }
            }
            prev = c;
        }

        System.out.println(ans ? "Yes" : "No");

        sc.close();
    }
}
