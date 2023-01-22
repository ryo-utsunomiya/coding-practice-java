package atcoder.abc157.b;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        Map<Integer, int[]> numberToIndex = new HashMap<>();

        int[][] card = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
                numberToIndex.put(card[i][j], new int[]{i,j});
            }
        }

        int n = sc.nextInt();
        int[] bingo = new int[n];
        for (int i = 0; i < n; i++) {
            bingo[i] = sc.nextInt();
        }

        for (int number : bingo) {
            int[] index = numberToIndex.get(number);
            if (index != null) {
                int i = index[0];
                int j = index[1];
                card[i][j] = 0;
                numberToIndex.remove(number);
            }
        }

//        for (int[] row : card) {
//            System.out.println(Arrays.toString(row));
//        }

        if (
                (card[0][0] == 0 && card[0][1] == 0 && card[0][2] == 0) ||
                (card[1][0] == 0 && card[1][1] == 0 && card[1][2] == 0) ||
                (card[2][0] == 0 && card[2][1] == 0 && card[2][2] == 0) ||

                (card[0][0] == 0 && card[1][0] == 0 && card[2][0] == 0) ||
                (card[0][1] == 0 && card[1][1] == 0 && card[2][1] == 0) ||
                (card[0][2] == 0 && card[1][2] == 0 && card[2][2] == 0) ||

                (card[0][0] == 0 && card[1][1] == 0 && card[2][2] == 0) ||
                (card[2][0] == 0 && card[1][1] == 0 && card[0][2] == 0)
        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
