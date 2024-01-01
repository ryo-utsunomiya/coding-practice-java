package atcoder.abc082.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        char[] sCharArray = s.toCharArray();
        Arrays.sort(sCharArray);
        String sAsc = new String(sCharArray);

        char[] tCharArray = t.toCharArray();
        Arrays.sort(tCharArray);
        String tAsc = new String(tCharArray);
        String tDesc = new StringBuilder(tAsc).reverse().toString();

        boolean ans = sAsc.compareTo(tDesc) < 0;
        System.out.println(ans ? "Yes" : "No");

        sc.close();
    }
}
