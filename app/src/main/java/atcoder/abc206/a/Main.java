package atcoder.abc206.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int priceWithTax = n * 108 / 100;
        int regularPrice = 206;

        if (priceWithTax < regularPrice) {
            System.out.println("Yay!");
        } else if (priceWithTax == regularPrice) {
            System.out.println("so-so");
        } else {
            System.out.println(":(");
        }

        sc.close();
    }
}
