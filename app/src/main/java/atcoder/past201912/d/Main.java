package atcoder.past201912.d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int[] bucket = new int[n + 1];
        for (int i = 0; i < n; i++) {
            bucket[a[i]]++;
        }

        boolean isCorrect = true;
        int wrong = 0;
        int correct = 0;
        for (int i = 1; i <= n; i++) {
            if (bucket[i] == 0) {
                isCorrect = false;
                correct = i;
            } if (bucket[i] == 2) {
                isCorrect = false;
                wrong = i;
            }
        }
        if (isCorrect) {
            System.out.println("Correct");
        } else {
            System.out.printf("%d %d", wrong, correct);
        }
    }
}
