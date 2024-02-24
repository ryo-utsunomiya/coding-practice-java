package udemy.datastructuresandalgorithmsdeepdiveusingjava.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        mergeSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
        mergeSortDesc(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) { // one element array -> do nothing
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) { // optimization
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // Copy remaining elements
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        // Copy temp array into input array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    public static void mergeSortDesc(int[] input, int start, int end) {
        if (end - start < 2) { // one element array -> do nothing
            return;
        }

        int mid = (start + end) / 2;
        mergeSortDesc(input, start, mid);
        mergeSortDesc(input, mid, end);
        mergeDesc(input, start, mid, end);
    }

    private static void mergeDesc(int[] input, int start, int mid, int end) {
        if (input[mid - 1] > input[mid]) { // optimization
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] > input[j] ? input[i++] : input[j++];
        }

        // Copy remaining elements
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        // Copy temp array into input array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
