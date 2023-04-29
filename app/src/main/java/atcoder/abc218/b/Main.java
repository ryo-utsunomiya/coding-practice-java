package atcoder.abc218.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        for (int n = 26; n > 0; n--) {
            int i = sc.nextInt();
            System.out.print( (char)('a' + (i - 1)) );
        }

        sc.close();
    }
}
