package atcoder.agc016.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int minOperations = Integer.MAX_VALUE;

        for (char targetChar = 'a'; targetChar <= 'z'; targetChar++) {
            int operations = 0;
            String t = s;

            if (!containsOnlySpecificChar(t, targetChar)) {
                while (true) {
                    var sb = new StringBuilder();
                    for (int i = 0; i < t.length() - 1; i++) {
                        char cCurrent = t.charAt(i);
                        char cNext = t.charAt(i+1);
                        if (cCurrent == targetChar || cNext == targetChar) {
                            sb.append(targetChar);
                        } else {
                            sb.append(cCurrent);
                        }
                    }

                    operations++;

                    if (containsOnlySpecificChar(sb.toString(), targetChar)) {
                        break;
                    } else {
                        t = sb.toString();
                    }
                }
            }

            minOperations = Math.min(minOperations, operations);
        }

        System.out.println(minOperations);
    }

    static boolean containsOnlySpecificChar(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}
