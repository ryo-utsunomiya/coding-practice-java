package leetcode.designhashmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
    private final List<List<KeyValuePair>> buckets;
    private static final int NUM_BUCKETS = 31;


    public MyHashMap() {
        buckets = new ArrayList<>();
        for (int i = 0; i < NUM_BUCKETS; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void put(int key, int value) {
        var bucket = findBucket(key);
        var keyValuePair = findByKey(key, bucket);
        if (keyValuePair == null) {
            bucket.add(new KeyValuePair(key, value));
        } else {
            keyValuePair.value = value;
        }
    }

    public int get(int key) {
        var kvp = findByKey(key);
        if (kvp == null) {
            return -1;
        } else {
            return kvp.value;
        }
    }

    public void remove(int key) {
        var bucket = findBucket(key);
        bucket.removeIf(kvp -> kvp.key == key);
    }

    private KeyValuePair findByKey(int key) {
        return findByKey(key, findBucket(key));
    }

    private KeyValuePair findByKey(int key, List<KeyValuePair> bucket) {
        for (var kvp : bucket) {
            if (kvp.key == key) {
                return kvp;
            }
        }
        return null;
    }

    private List<KeyValuePair> findBucket(int key) {
        return buckets.get(hash(key));
    }

    private int hash(int key) {
        return key % NUM_BUCKETS;
    }

    static class KeyValuePair {
        int key;
        int value;

        public KeyValuePair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

//    public static void main(String[] args) {
//        MyHashMap myHashMap = new MyHashMap();
//        myHashMap.put(1, 1); // The map is now [[1,1]]
//        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
//        System.out.println(myHashMap.get(1));;    // return 1, The map is now [[1,1], [2,2]]
//        System.out.println(myHashMap.get(3));;    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
//        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
//        System.out.println(myHashMap.get(2));;    // return 1, The map is now [[1,1], [2,1]]
//        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
//        System.out.println(myHashMap.get(2));;    // return -1 (i.e., not found), The map is now [[1,1]]
//    }
}
