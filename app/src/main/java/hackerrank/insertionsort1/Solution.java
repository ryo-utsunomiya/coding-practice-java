package hackerrank.insertionsort1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int target = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > target) { // test lower index value
                // copy the value at the lower index to the current index
                arr.set(i + 1, arr.get(i));
                printList(arr);
            }
            // insert the target value
            if (i == 0 || arr.get(i-1) < target) {
                arr.set(i, target);
                printList(arr);
                break;
            }
        }
    }

    static void printList(List<Integer> arr) {
        var strings = arr.stream().map(String::valueOf).collect(toList());
        System.out.println(String.join(" ", strings));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Result.insertionSort1(5, Arrays.asList(1,2,4,5,3));
        Result.insertionSort1(5, Arrays.asList(2, 4, 6, 8, 3));
        Result.insertionSort1(10, Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.insertionSort1(n, arr);
//
//        bufferedReader.close();
    }
}
