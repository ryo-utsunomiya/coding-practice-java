package atcoder.typical90._027;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var registeredNames = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            if (registeredNames.add(sc.next())) { // 未登録の場合は true
                System.out.println(i + 1);
            }
        }

        sc.close();
    }
}
