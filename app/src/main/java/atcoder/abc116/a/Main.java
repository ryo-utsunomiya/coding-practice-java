package atcoder.abc116.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int ca = sc.nextInt();
        sc.close();

        System.out.println(bc * ab / 2);
    }
}
