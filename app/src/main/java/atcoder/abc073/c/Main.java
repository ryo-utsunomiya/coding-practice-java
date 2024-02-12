package atcoder.abc073.c;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        var nums = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = a[i];
            if (!nums.add(num)) {
                nums.remove(num);
            }
        }
        System.out.println(nums.size());

        sc.close();
    }
}
