package atcoder.abc049.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String c = sc.next();
        System.out.println("aeiou".contains(c) ? "vowel" : "consonant");

        sc.close();
    }
}
