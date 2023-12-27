package atcoder.abc103.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var tasks = new ArrayList<Integer>();
        tasks.add(sc.nextInt());
        tasks.add(sc.nextInt());
        tasks.add(sc.nextInt());
        tasks.sort(Comparator.comparingInt(a -> a));

        int cost = 0;
        for (int i = 1; i < 3; i++) {
            cost += Math.abs(tasks.get(i-1) - tasks.get(i));
        }
        System.out.println(cost);

        sc.close();
    }
}
