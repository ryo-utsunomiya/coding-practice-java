package leetcode.openthelock;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

// https://leetcode.com/problems/open-the-lock/
public class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(List.of(deadends));

        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        queue.offer(null); // step indicator

        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int step = 0;
        while (!queue.isEmpty()) {
            String lock = queue.poll();
            if (lock == null) {
                step++;
                if (queue.peek() != null) {
                    queue.offer(null);
                }
            } else if (lock.equals(target)) {
                return step;
            } else if (!dead.contains(lock)) {
                for (int i = 0; i < 4; i++) {
                    for (int d = -1; d <= 1; d += 2) {
                        char c = lock.charAt(i);
                        int newN = (c - '0' + d + 10) % 10;
                        char newC = (char)(newN + '0');
                        String newLock = lock.substring(0, i) + (newC + "") + lock.substring(i+1);
                        if (!dead.contains(newLock) && !visited.contains(newLock)) {
                            queue.offer(newLock);
                            visited.add(newLock);
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 6
        System.out.println(s.openLock(
                new String[]{"0201", "0101", "0102", "1212", "2002"},
                "0202"
        ));
        // 1
        System.out.println(s.openLock(
                new String[]{"8888"},
                "0009"
        ));
        // -1
        System.out.println(s.openLock(
                new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"},
                "8888"
        ));
        // -1
        System.out.println(s.openLock(
                new String[]{"0000"},
                "8888"
        ));
    }
}
