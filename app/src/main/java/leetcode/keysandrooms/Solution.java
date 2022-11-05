package leetcode.keysandrooms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Set<Integer> keys = new HashSet<>(rooms.get(0));
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        Deque<Integer> queue = new ArrayDeque<>();
        for (int key : keys) {
            queue.offer(key);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!visited.contains(current) && keys.contains(current)) {
                keys.addAll(rooms.get(current));
                visited.add(current);
                for (int key : keys) {
                    queue.offer(key);
                }
            }
        }

        return n == visited.size();
    }

    public static void main(String[] args) {
        var s = new Solution();
        // true
        System.out.println(s.canVisitAllRooms(List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        )));
        // false
        System.out.println(s.canVisitAllRooms(List.of(
                List.of(1, 3),
                List.of(3,0,1),
                List.of(2),
                List.of(0)
        )));
    }
}
