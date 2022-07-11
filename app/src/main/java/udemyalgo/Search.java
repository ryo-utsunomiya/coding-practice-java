package udemyalgo;

import java.util.List;

public class Search {
    public int binarySearch(List<Integer> numbers, int value) {
        int left = 0, right = numbers.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers.get(mid) == value) {
                return mid;
            } else if (numbers.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        var s = new Search();
        System.out.println(s.binarySearch(List.of(1,2,3,4,5), 3));
    }
}
