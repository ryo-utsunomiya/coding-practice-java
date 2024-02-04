package atcoder.abc137.b;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        var nums = new ArrayList<String>();
        for (int i = x - k + 1; i < x + k; i++) {
            nums.add(String.valueOf(i));
        }
        System.out.println(String.join(" ", nums));
    }
}
