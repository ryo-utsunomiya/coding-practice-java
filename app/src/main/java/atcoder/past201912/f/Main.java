package atcoder.past201912.f;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        List<String> words = new ArrayList<>();

        for (int i = 0, len = s.length(); i < len; i++) {
            // s[j] が大文字になるまで j をインクリメント
            int j = i + 1;
            while (j < len && Character.isLowerCase(s.charAt(j))) {
                j++;
            }
            words.add(s.substring(i, j + 1));

            i = j;
        }

        words.sort(Comparator.comparing(String::toLowerCase));

        System.out.println(String.join("", words));
    }
}
