package atcoder.abc173.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] results = new String[n];
        for (int i = 0; i < n; i++) {
            results[i] = sc.next();
        }

        Map<String, Integer> summary = new HashMap<>();
        summary.put("AC", 0);
        summary.put("WA", 0);
        summary.put("TLE", 0);
        summary.put("RE", 0);

        for (String result : results) {
            summary.put(result, summary.get(result) + 1);
        }

        System.out.printf("AC x %d\n", summary.get("AC"));
        System.out.printf("WA x %d\n", summary.get("WA"));
        System.out.printf("TLE x %d\n", summary.get("TLE"));
        System.out.printf("RE x %d\n", summary.get("RE"));

        sc.close();
    }
}
