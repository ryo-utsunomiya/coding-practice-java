package atcoder.abc139.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int numPowerStrips = 0;
        int numPowerPlugSockets = 1;
        while (numPowerPlugSockets < b) {
            if (numPowerStrips == 0) {
                numPowerPlugSockets = a;
            } else {
                numPowerPlugSockets += a - 1;
            }
            numPowerStrips++;
        }
        System.out.println(numPowerStrips);
    }
}
