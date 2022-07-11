package udemyalgo;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public List<Integer> quickSort(List<Integer> numbers) {
        return quickSort(new ArrayList<>(numbers), 0, numbers.size() - 1);
    }

    private List<Integer> quickSort(List<Integer> numbers, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(numbers, left, right);
            quickSort(numbers, left, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, right);
        }
        return numbers;
    }

    private int partition(List<Integer> numbers, int left, int right) {
        int pivot = numbers.get(right);
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                swap(numbers, i, j);
            }
        }

        int partitionIndex = i + 1;
        swap(numbers, partitionIndex, right);
        return partitionIndex;
    }

    void swap(List<Integer> numbers, int i, int j) {
        int tmp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, tmp);
    }

    public List<Integer> mergeSort(List<Integer> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }

        numbers = new ArrayList<>(numbers); // Convert to modifiable List
        int center = numbers.size() / 2;
        // Create new ArrayList because subList returns only a view, not a new list
        List<Integer> left = new ArrayList<>(numbers.subList(0, center));
        List<Integer> right = new ArrayList<>(numbers.subList(center, numbers.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                numbers.set(k, left.get(i));
                i++;
            } else {
                numbers.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            numbers.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            numbers.set(k, right.get(j));
            j++;
            k++;
        }

        return numbers;
    }

    public static void main(String[] args) {
        var s = new Sort();
        System.out.println(s.quickSort(List.of(1, 8, 3, 9, 4, 5, 7)));
        System.out.println(s.mergeSort(List.of(1, 8, 3, 9, 4, 5, 7)));
    }
}
