package atcoder.past202104.a;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern POSTAL_CODE_PATTERN = Pattern.compile("\\d{3}-\\d{4}");

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        System.out.println(POSTAL_CODE_PATTERN.matcher(s).matches() ? "Yes" : "No");
    }
}
