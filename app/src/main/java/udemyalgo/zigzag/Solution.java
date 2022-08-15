package udemyalgo.zigzag;

import java.util.Objects;

public class Solution {
    public void zigzag(int height, char startChar, char endChar) {
        int width = (endChar - startChar + 1) * 2;
        String[][] table = new String[height][width];

        char c = startChar;
        int h = height / 2;
        boolean up = false;
        int w = 0;
        int cnt = 0;
        while (cnt < width) {
            table[h][w] = String.valueOf(c);

            c++;
            if (c > endChar) {
                c = startChar;
            }

            if (up && h+1 >= height) {
                up = false;
            }
            if (!up && h-1 < 0) {
                up = true;
            }
            if (up) {
                h++;
            } else {
                h--;
            }

            w++;
            cnt++;
        }

        for (h = 0; h < height; h++) {
            for (w = 0; w < width; w++) {
                System.out.print(Objects.requireNonNullElse(table[h][w], " "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        s.zigzag(3, '0', '9');
        s.zigzag(10, 'a', 'z');
    }
}
