package atcoder.past202010.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[5];
        for (int i = 0; i < 5; i++) {
            s[i] = sc.next();
        }
        sc.close();

        var sb = new StringBuilder();

        for (int j = 0; j < n * 4; j += 4) {
            if (s[0].startsWith(".###", j)
                && s[1].startsWith(".#.#", j)
                && s[2].startsWith(".#.#", j)
                && s[3].startsWith(".#.#", j)
                && s[4].startsWith(".###", j)) {
                sb.append("0");
            } else if (s[0].startsWith("..#.", j)
                && s[1].startsWith(".##.", j)
                && s[2].startsWith("..#.", j)
                && s[3].startsWith("..#.", j)
                && s[4].startsWith(".###", j)) {
                sb.append("1");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith("...#", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith(".#..", j)
                && s[4].startsWith(".###", j)) {
                sb.append("2");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith("...#", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith("...#", j)
                && s[4].startsWith(".###", j)) {
                sb.append("3");
            } else if (s[0].startsWith(".#.#", j)
                && s[1].startsWith(".#.#", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith("...#", j)
                && s[4].startsWith("...#", j)) {
                sb.append("4");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith(".#..", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith("...#", j)
                && s[4].startsWith(".###", j)) {
                sb.append("5");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith(".#..", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith(".#.#", j)
                && s[4].startsWith(".###", j)) {
                sb.append("6");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith("...#", j)
                && s[2].startsWith("...#", j)
                && s[3].startsWith("...#", j)
                && s[4].startsWith("...#", j)) {
                sb.append("7");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith(".#.#", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith(".#.#", j)
                && s[4].startsWith(".###", j)) {
                sb.append("8");
            } else if (s[0].startsWith(".###", j)
                && s[1].startsWith(".#.#", j)
                && s[2].startsWith(".###", j)
                && s[3].startsWith("...#", j)
                && s[4].startsWith(".###", j)) {
                sb.append("9");
            } else {
                sb.append("?");
            }
        }

        System.out.println(sb);
    }
}
