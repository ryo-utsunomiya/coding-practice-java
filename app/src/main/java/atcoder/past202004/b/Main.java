package atcoder.past202004.b;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();

        var votes = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            votes.put(c, votes.getOrDefault(c, 0) + 1);
        }

        char ans = 'a';
        int maxVote = 0;
        for (var entry : votes.entrySet()) {
            if (entry.getValue() > maxVote) {
                ans = entry.getKey();
                maxVote = entry.getValue();
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
