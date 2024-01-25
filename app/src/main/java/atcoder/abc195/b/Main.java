package atcoder.abc195.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt() * 1000;

        int minNum = (int) Math.ceil((double)w / b);
        int maxNum = (int) Math.floor((double)w / a);

        if (minNum * a > w || maxNum * b < w) {
            System.out.println("UNSATISFIABLE");
        } else {
            System.out.printf("%d %d\n", minNum, maxNum);
        }

        sc.close();
    }
}
