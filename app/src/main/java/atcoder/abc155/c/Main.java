package atcoder.abc155.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        var nameToCount = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            nameToCount.put(name, nameToCount.getOrDefault(name, 0) + 1);
        }
        sc.close();

        int maxCount = 0;
        for (int count : nameToCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        var maxVotedNames = new ArrayList<String>();
        for (String name : nameToCount.keySet()) {
            if (nameToCount.get(name) == maxCount) {
                maxVotedNames.add(name);
            }
        }

        Collections.sort(maxVotedNames);

        for (String name : maxVotedNames) {
            System.out.println(name);
        }
    }
}
