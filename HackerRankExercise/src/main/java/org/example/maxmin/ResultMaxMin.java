package org.example.maxmin;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultMaxMin {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        System.out.println(arr);
        Long max = 0L;
        Long min = 0L;
        for (int i = 0; i < arr.size() - 1; i++) {
            min += arr.get(i);
        }
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            max += arr.get(i);
        }
        System.out.println(min + " " + max);
    }

}

