package atcoder.past202104.c;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 携帯電話の種類の数
        int m = scanner.nextInt(); // 携帯電話の周波数帯の数

        var k = new ArrayList<Set<Integer>>();
        for (int i = 0; i < n; i++) {
            var bands = new HashSet<Integer>();
            int num = scanner.nextInt();
            for (int j = 0; j < num; j++) {
                bands.add(scanner.nextInt());
            }
            k.add(i, bands);
        }
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[] b = new int[p];
        for (int i = 0; i < p; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int numSupportedBands = 0;
            for (int j = 0; j < p; j++) {
                if (k.get(i).contains(b[j])) {
                    numSupportedBands++;
                }
            }
            if (numSupportedBands >= q) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
