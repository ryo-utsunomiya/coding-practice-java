package atcoder.past202010.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] nums = new int[]{a, b, c};
        Arrays.sort(nums);

        if (nums[1] == a) {
            System.out.println("A");
        } else if (nums[1] == b) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        sc.close();
    }
}
