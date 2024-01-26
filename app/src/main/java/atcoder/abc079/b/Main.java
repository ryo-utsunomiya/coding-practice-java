package atcoder.abc079.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] nums = new long[n+1];
        nums[0] = 2;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        System.out.println(nums[n]);

        sc.close();
    }
}
