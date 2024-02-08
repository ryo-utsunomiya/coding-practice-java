package atcoder.abc154.c;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var nums = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(nums.size() == n ? "YES" : "NO");

        sc.close();
    }
}
