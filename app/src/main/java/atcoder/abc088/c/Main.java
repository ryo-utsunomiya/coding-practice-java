package atcoder.abc088.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = scanner.nextInt();
            }
        }

        // 高橋君の情報が正しいとすると、 c[i][j] == a[i] + b[j] より、
        // a,b のいずれか一つの値が定まると他の値が全て定まる。
        // そこで、 a[0] = 0 と仮定する。
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = 0;
        b[0] = c[0][0] - a[0];
        b[1] = c[0][1] - a[0];
        b[2] = c[0][2] - a[0];
        a[1] = c[1][0] - b[0];
        a[2] = c[2][0] - b[0];

        // 全ての i,j の組み合わせに対して c[i][j] == a[i] + b[j] を満たすことを確認
        boolean isValid = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (c[i][j] != a[i] + b[j]) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) {
                break;
            }
        }

        System.out.println(isValid ? "Yes" : "No");
    }
}
