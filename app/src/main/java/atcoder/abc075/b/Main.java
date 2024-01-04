package atcoder.abc075.b;

import java.util.Scanner;

public class Main {
    // x=0,y=0 を除く8方向
    private static final int[] DX = new int[]{-1,0,1, -1,1, -1,0,1};
    private static final int[] DY = new int[]{-1,-1,-1, 0,0, 1,1,1};

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }

        String[] result = new String[h];
        for (int i = 0; i < h; i++) {
            var row = new StringBuilder();
            for (int j = 0; j < w; j++) {
                if (s[i].charAt(j) == '#') {
                    row.append('#');
                } else {
                    int num = 0;
                    for (int d = 0; d < 8; d++) {
                        int ni = i + DX[d];
                        int nj = j + DY[d];
                        if (0 <= ni && ni < w && 0 <= nj && nj < h) {
                            if (s[ni].charAt(nj) == '#') {
                                num++;
                            }
                        }
                    }
                    row.append(num);
                }
            }
            result[i] = row.toString();
        }

        for (String row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}
