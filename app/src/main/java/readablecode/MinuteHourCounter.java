package readablecode;

import java.time.Instant;

public class MinuteHourCounter {
    private final TrailingBucketCounter minuteCounts;
    private final TrailingBucketCounter hourCounts;

    public MinuteHourCounter() {
        minuteCounts = new TrailingBucketCounter(60, 1);
        hourCounts = new TrailingBucketCounter(60, 60);
    }

    public void add(int count) {
        var now = Instant.now();
        minuteCounts.add(count, now);
        hourCounts.add(count, now);
    }

    public int minuteCount() {
        return minuteCounts.trailingCount(Instant.now());
    }

    public int hourCount() {
        return hourCounts.trailingCount(Instant.now());
    }
}
