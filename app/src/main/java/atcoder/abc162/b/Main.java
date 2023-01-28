package atcoder.abc162.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sumAll = sumN(n);
        long sumFizz = sumN(n/3) * 3;
        long sumBuzz = sumN(n/3) * 5;
        long sumFizzBuzz = sumN(n/15) * 15;
        System.out.println(sumAll - sumFizz - sumBuzz + sumFizzBuzz);

        sc.close();
    }

    static long sumN(long n) {
        return n * (n + 1) / 2;
    }
}
