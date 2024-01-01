package atcoder.past201912.a;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Pattern pattern = Pattern.compile("^[0-9]{3}$");

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        if (pattern.matcher(s).matches()) {
            int n = Integer.parseInt(s);
            System.out.println(n * 2);
        } else {
            System.out.println("error");
        }

        sc.close();
    }
}
