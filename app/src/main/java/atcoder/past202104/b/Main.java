package atcoder.past202104.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int answer = -1;
        for (int i = 0; i < s.length(); i += 4) {
            if ("post".equals(s.substring(i, i + 4))) {
                answer = (i / 4) + 1;
                break;
            }
        }
        if (answer == -1) {
            System.out.println("none");
        } else {
            System.out.println(answer);;
        }
    }
}
