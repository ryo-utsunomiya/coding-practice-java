package leetcode.minimumindexsumoftwolists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public String[] findRestaurant(String[] a1, String[] a2) {
        List<String> l1 = Arrays.asList(a1);
        List<String> l2 = Arrays.asList(a2);
        var intersection = new ArrayList<>(l1);
        intersection.retainAll(l2);

        int minIndexSum = Integer.MAX_VALUE;
        for (String s : intersection) {
            int indexSum = l1.indexOf(s) + l2.indexOf(s);
            if (indexSum < minIndexSum) {
                minIndexSum = indexSum;
            }
        }

        Iterator<String> it = intersection.iterator();
        while (it.hasNext()) {
            String s = it.next();
            int indexSum = l1.indexOf(s) + l2.indexOf(s);
            if (indexSum > minIndexSum) {
                it.remove();;
            }
        }

        return intersection.toArray(new String[]{});
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(Arrays.toString(s.findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}
        )));
        System.out.println(Arrays.toString(s.findRestaurant(
                new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"KFC","Shogun","Burger King"}
        )));
    }
}
