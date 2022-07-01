package leetcode.loggerratelimiter;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private final Map<String, Integer> messages = new HashMap<>();

    public Logger() {

    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!messages.containsKey(message)) {
            messages.put(message, timestamp);
            return true;
        }

        Integer oldTimeStamp = messages.get(message);
        if (timestamp - oldTimeStamp >= 10) {
            messages.put(message, timestamp);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Logger l = new Logger();
        System.out.println(l.shouldPrintMessage(1, "foo"));  // return true, next allowed timestamp for "foo" is 1 + 10 = 11
        System.out.println(l.shouldPrintMessage(2, "bar"));  // return true, next allowed timestamp for "bar" is 2 + 10 = 12
        System.out.println(l.shouldPrintMessage(3, "foo"));  // 3 < 11, return false
        System.out.println(l.shouldPrintMessage(8, "bar"));  // 8 < 12, return false
        System.out.println(l.shouldPrintMessage(10, "foo")); // 10 < 11, return false
        System.out.println(l.shouldPrintMessage(11, "foo")); // 11 >= 11, return true, next allowed timestamp for "foo" is 11 + 10 = 21
    }
}
