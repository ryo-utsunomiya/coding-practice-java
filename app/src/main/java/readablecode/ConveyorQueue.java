package readablecode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConveyorQueue {
    private final Deque<Integer> queue;
    private final int maxItems;
    private int totalSum;

    public ConveyorQueue(int maxItems) {
        this.queue = new ArrayDeque<>();
        this.maxItems = maxItems;
        this.totalSum = 0;
    }

    public void shift(int numShifted) {
        // 項目がシフトされすぎた場合に、キューをクリアする
        if (numShifted >= maxItems) {
            queue.clear();
            totalSum = 0;
            return;
        }

        // 必要な分だけ0を入れる
        while (numShifted > 0) {
            queue.offer(0);
            numShifted--;
        }

        // 超過した項目は全て落とす
        while (queue.size() > maxItems) {
            Integer headSum = queue.poll();
            if (headSum != null) {
                totalSum -= headSum;
            }
        }
    }

    public void addToBack(int count) {
        if (queue.isEmpty()) {
            shift(1); // queue が少なくとも1つの項目を持つようにする
        }

        // 末尾の値を取り出し、新しい値に書き換え
        Integer v = queue.pollLast();
        if (v != null) {
            queue.offer(v + count);
        }

        totalSum += count;
    }

    public int totalSum() {
        return totalSum;
    }
}
