package atcoder.abc073.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String n = sc.next();
        System.out.println(n.contains("9") ? "Yes" : "No");

        sc.close();
    }
}
