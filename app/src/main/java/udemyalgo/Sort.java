package udemyalgo;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public List<Integer> quickSort(final List<Integer> numbers) {
        return quickSort(new ArrayList<>(numbers), 0, numbers.size() - 1);
    }

    private List<Integer> quickSort(final List<Integer> numbers, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(numbers, left, right);
            quickSort(numbers, left, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, right);
        }
        return numbers;
    }

    private int partition(final List<Integer> numbers, int left, int right) {
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

    void swap(final List<Integer> numbers, int i, int j) {
        int tmp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, tmp);
    }

    public List<Integer> mergeSort(final List<Integer> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }

        var sortedNumbers = new ArrayList<>(numbers); // Convert to modifiable List
        int center = sortedNumbers.size() / 2;
        // Create new ArrayList because subList returns only a view, not a new list
        List<Integer> left = new ArrayList<>(sortedNumbers.subList(0, center));
        List<Integer> right = new ArrayList<>(sortedNumbers.subList(center, sortedNumbers.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                sortedNumbers.set(k, left.get(i));
                i++;
            } else {
                sortedNumbers.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            sortedNumbers.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            sortedNumbers.set(k, right.get(j));
            j++;
            k++;
        }

        return sortedNumbers;
    }

    public List<Integer> bubbleSort(final List<Integer> numbers) {
        var sortedNumbers = new ArrayList<>(numbers); // Make a mutable list
        for (int i = 0; i < sortedNumbers.size(); i++) {
            for (int j = 0; j < sortedNumbers.size() - 1 - i; j++) {
                if (sortedNumbers.get(j) > sortedNumbers.get(j + 1)) {
                    swap(sortedNumbers, j, j+1);
                }
            }
        }
        return sortedNumbers;
    }

    public List<Integer> insertionSort(List<Integer> numbers) {
        numbers = new ArrayList<>(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            int tmp = numbers.get(i);
            int j = i - 1;
            while (j >= 0 && numbers.get(j) > tmp) {
                // shift
                numbers.set(j + 1, numbers.get(j));
                j--;
            }
            // insert
            numbers.set(j + 1, tmp);
        }
        return numbers;
    }

    // todo: Selection Sort

    public static void main(String[] args) {
        var s = new Sort();
        System.out.println(s.quickSort(List.of(1, 8, 3, 9, 4, 5, 7)));
        System.out.println(s.mergeSort(List.of(1, 8, 3, 9, 4, 5, 7)));
        System.out.println(s.bubbleSort(List.of(1, 8, 3, 9, 4, 5, 7)));
        System.out.println(s.insertionSort(List.of(1, 8, 3, 9, 4, 5, 7)));
    }
}
