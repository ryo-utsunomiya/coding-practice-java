package atcoder.typical90._033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        if (h == 1 || w == 1) {
            System.out.println(h * w);
        } else {
            System.out.println( ((h+1)/2) * ((w+1)/2) );
        }

        sc.close();
    }
}
