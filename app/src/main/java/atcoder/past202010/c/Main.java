package atcoder.past202010.c;

import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{-1,-1,-1,0,0,0,1,1,1};
    static int[] dy = new int[]{-1,0,1,-1,0,1,-1,0,1};

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 0;

                for (int k = 0; k < 9; k++) {
                    int tmpI = i + dy[k];
                    int tmpJ = j + dx[k];

                    if (0 <= tmpI && tmpI < n && 0 <= tmpJ && tmpJ < m) {
                        if (s[tmpI].charAt(tmpJ) == '#') {
                            count++;
                        }
                    }
                }

                System.out.print(count);
            }
            System.out.println();
        }

        sc.close();
    }
}
