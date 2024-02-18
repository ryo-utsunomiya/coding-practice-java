package atcoder.abc200.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // 愚直に解くと計算量が O(N^2) になって TLE になる
        // 「a[i] - a[j] が200の倍数である」という条件を、
        // 「a[i] を200で割った余りと a[j] を200で割った余りが一致する」と読み替える
        // すると、同じ余りを持つ数の個数を数えて、その中から2つを選ぶ組み合わせを求めることで
        // 計算量を O(N) に減らせる

        // 200で割った時の余りによって数を分類し、それぞれの数を数える
        int[] remainderCounts = new int[200];
        for (int i = 0; i < n; i++) {
            remainderCounts[a[i] % 200]++;
        }

        long totalPairs = 0;
        for (int count : remainderCounts) {
            // n個の中から2つを選ぶ組み合わせ: n*(n-1)/2
            totalPairs += (long)count * (count - 1) / 2;
        }
        System.out.println(totalPairs);
    }
}
