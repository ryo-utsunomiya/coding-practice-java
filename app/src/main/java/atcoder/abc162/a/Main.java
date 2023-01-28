package atcoder.abc162.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "No";
        while (n > 0) {
            if (n % 10 == 7) {
                ans = "Yes";
                break;
            }
            n /= 10;
        }
        System.out.println(ans);

        sc.close();
    }
}
