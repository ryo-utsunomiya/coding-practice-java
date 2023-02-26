package atcoder.abc068.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] answers = new int[]{64,32,16,8,4,2,1};
        for (int answer : answers) {
            if (answer <= n) {
                System.out.println(answer);
                break;
            }
        }

        sc.close();
    }
}
