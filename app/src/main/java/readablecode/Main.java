package readablecode;

import java.time.Instant;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var counter = new MinuteHourCounter();
        while (true) {
            System.out.println(Instant.now());
            int count = (int)(100 * Math.random());
            System.out.printf("count: %d\n", count);
            counter.add(count);
            System.out.printf("minuteCount: %d\n", counter.minuteCount());
            System.out.printf("hourCount: %d\n", counter.hourCount());
            System.out.println();
            Thread.sleep(1000);
        }
    }
}
