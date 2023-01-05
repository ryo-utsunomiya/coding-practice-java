package atcoder.abc088.a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();

        int r = n % 500;
        String ans = r <= a ? "Yes" : "No";
        System.out.println(ans);

        sc.close();
    }
}
