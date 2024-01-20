package readablecode;

import java.time.Instant;

public class TrailingBucketCounter {
    private final ConveyorQueue buckets;
    private final int secsPerBucket;
    private Instant lastUpdateTime;

    public TrailingBucketCounter(int numBuckets, int secsPerBucket) {
        this.buckets = new ConveyorQueue(numBuckets);
        this.secsPerBucket = secsPerBucket;
        this.lastUpdateTime = Instant.now();
    }

    public void add(int count, Instant now) {
        update(now);
        buckets.addToBack(count);
    }

    public int trailingCount(Instant now) {
        update(now);
        return buckets.totalSum();
    }

    private void update(Instant now) {
        long currentBucket = now.getEpochSecond() / secsPerBucket;
        long lastUpdateBucket = lastUpdateTime.getEpochSecond() / secsPerBucket;
        int numShifted = (int)(currentBucket - lastUpdateBucket);
        buckets.shift(numShifted);
        lastUpdateTime = now;
    }
}
