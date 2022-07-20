package udemyalgo.hashtable;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class HashTable {
    private final List<List<String>> table;
    private final int size;

    public HashTable() {
        this(10);
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.table.add(new ArrayList<>());
        }
    }

    public void add(String key, String value) {
        List<String> data = getData(key);
        if (data.isEmpty()) {
            data.add(key);
            data.add(value);
        } else if (data.get(0).equals(key)) {
            data.set(1, value);
        } else {
            data.add(key);
            data.add(value);
        }
    }

    public String get(String key) {
        List<String> data = getData(key);
        for (int i = 0; i < data.size(); i += 2) {
            if (data.get(i).equals(key)) {
                return data.get(i + 1);
            }
        }
        return null;
    }

    private List<String> getData(String key) {
        return this.table.get(hash(key));
    }

    private int hash(String key) {
        MessageDigest md5 = getMd5MessageDigest();
        byte[] bytes = md5.digest(key.getBytes());
        return Math.abs(ByteBuffer.wrap(bytes).getInt()) % this.size;
    }

    private MessageDigest getMd5MessageDigest() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        var h = new HashTable();
        h.add("car", "Tesla");
        h.add("car", "Tesla");
        h.add("car", "Toyota");
        h.add("pc", "Mac");
        h.add("sns", "Youtube");
//        System.out.println(h.table);
        System.out.println(h.get("car"));
        System.out.println(h.get("pc"));
        System.out.println(h.get("sns"));
        System.out.println(h.get("phone"));
    }
}
