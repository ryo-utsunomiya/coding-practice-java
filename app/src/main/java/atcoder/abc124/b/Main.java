package atcoder.abc124.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int answer = 0;
        int maxHeight = 0;
        for (int height : h) {
            if (height >= maxHeight) {
                maxHeight = height;
                answer++;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
