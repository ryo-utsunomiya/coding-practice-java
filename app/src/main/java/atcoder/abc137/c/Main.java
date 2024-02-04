package atcoder.abc137.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            strings[i] = scanner.next();
        }
        scanner.close();

        // 文字列をソートしてキーにし、同じキーをもつ文字列の数を数える
        var keyToNum = new HashMap<String, Integer>();
        for (String s : strings) {
            String key = sortString(s);
            keyToNum.put(key, keyToNum.getOrDefault(key, 0) + 1);
        }

        long ans = 0;
        for (int n : keyToNum.values()) {
            ans += (long) n * (n-1) / 2; // n個の中から2つを選ぶ組み合わせの数(nC2)
        }
        System.out.println(ans);
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
