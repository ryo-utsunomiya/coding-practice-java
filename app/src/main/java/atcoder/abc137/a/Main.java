package atcoder.abc137.a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            // −100 ≤ A, B ≤ 100
            int A = sc.nextInt();
            int B = sc.nextInt();
            List<Integer> nums = new ArrayList<>();
            nums.add(A + B);
            nums.add(A - B);
            nums.add(A * B);
            System.out.println(nums.stream().max(Integer::compareTo).orElseThrow());
        }
    }
}
