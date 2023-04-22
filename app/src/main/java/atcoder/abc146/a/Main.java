package atcoder.abc146.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.next();
        int answer;
        switch (s) {
            case "SUN":
                answer = 7;
                break;
            case "MON":
                answer = 6;
                break;
            case "TUE":
                answer = 5;
                break;
            case "WED":
                answer = 4;
                break;
            case "THU":
                answer = 3;
                break;
            case "FRI":
                answer = 2;
                break;
            case "SAT":
                answer = 1;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.out.println(answer);

        sc.close();
    }
}
