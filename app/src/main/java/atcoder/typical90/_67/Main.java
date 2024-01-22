package atcoder.typical90._67;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String n = sc.next();
        int k = sc.nextInt();
        while (k > 0) {
            String base9 = longToBase9(base8ToLong(n));
            n = base9.replace('8', '5');
            k--;
        }
        System.out.println(n);

        sc.close();
    }

    static long base8ToLong(String s) {
        long result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 8 + (s.charAt(i) - '0');
        }
        return result;
    }

    static String longToBase9(long n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append((char)(n % 9 + '0'));
            n /= 9;
        }
        return sb.reverse().toString();
    }
}
