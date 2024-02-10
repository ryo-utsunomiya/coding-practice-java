package hackerrank.insertionsort2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int i = 1; i < n; i++) {
            int tmp = arr.get(i);
            int j = i;
            for (; j > 0 && arr.get(j - 1) > tmp; j--) { // test the lower index
                // copy the value at the lower index to the current index
                arr.set(j, arr.get(j - 1));
            }
            // insert the tmp value
            arr.set(j, tmp);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
//        Result.insertionSort2(5, Arrays.asList(1,2,4,5,3));
//        Result.insertionSort2(5, Arrays.asList(2, 4, 6, 8, 3));
//        Result.insertionSort2(10, Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
        Result.insertionSort2(7, Arrays.asList(3, 4, 7, 5, 6, 2, 1));
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
