package atcoder.abc107.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }

        // 黒を含む行・列を記録する
        boolean[] row = new boolean[h];
        Arrays.fill(row, false);

        boolean[] col = new boolean[w];
        Arrays.fill(col, false);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] == '#') {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            if (row[i]) {
                for (int j = 0; j < w; j++) {
                    if (col[j]) {
                        System.out.print(a[i][j]);
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }

    private static void removeRow(char[][] a, int i) {
        int w = a[i].length;
        boolean removeRow = true;
        for (int j = 0; j < w; j++) {
            if (a[i][j] == '#') {
                removeRow = false;
                break;
            }
        }
        if (removeRow) {
            for (int j = 0; j < w; j++) {
                a[i][j] = ' ';
            }
        }
    }

    private static void removeColumn(char[][] a, int j) {
        int h = a.length;
        boolean removeColumn = true;
        for (int i = 0; i < h; i++) {
            if (a[i][j] == '#') {
                removeColumn = false;
                break;
            }
        }
        if (removeColumn) {
            for (int i = 0; i < h; i++) {
                a[i][j] = ' ';
            }
        }
    }
}
