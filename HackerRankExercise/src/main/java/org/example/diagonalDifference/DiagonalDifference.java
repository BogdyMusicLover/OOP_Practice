package org.example.diagonalDifference;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int dif = 0;
        int x = arr.get(0).size() - 1;

        for (int y = 0; y < arr.size(); y++) {
            dif += arr.get(y).get(y);
            dif -= arr.get(y).get(x - y);
        }

        return Math.abs(dif);
    }

    public static void main(String[] args) {

    }
}


