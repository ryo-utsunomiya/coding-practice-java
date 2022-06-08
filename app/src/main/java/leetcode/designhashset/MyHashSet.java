package leetcode.designhashset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private final List<List<Integer>> buckets;
    private static final int NUM_BUCKETS = 31;

    public MyHashSet() {
        buckets = new ArrayList<>();
        for (int i = 0; i < NUM_BUCKETS; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        List<Integer> bucket = findBucket(key);
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        findBucket(key).remove((Integer) key);
    }

    public boolean contains(int key) {
        return findBucket(key).contains(key);
    }

    private List<Integer> findBucket(int key) {
        return buckets.get(hash(key));
    }

    private int hash(int key) {
        return key % NUM_BUCKETS;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(1));; // return True
        System.out.println(myHashSet.contains(3));; // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        System.out.println(myHashSet.contains(2));; // return True
        myHashSet.remove(2);   // set = [1]
        System.out.println(myHashSet.contains(2));; // return False, (already removed)
    }
}
