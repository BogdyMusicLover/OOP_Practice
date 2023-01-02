package org.example.positivenegativecount;

import java.util.ArrayList;
import java.util.List;

public class ResultPositiveNegative {
    public static void plusMinus(List<Integer> arr) {

        int n = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=0; i<n; i++){
            if(arr.get(i) == 0){
                zero++;
            }
            if(arr.get(i) < 0 ){
                negative++;
            }
            if(arr.get(i) > 0){
                positive++;
            }
        }

        System.out.println((double) positive/n);
        System.out.println((double) negative/n);
        System.out.println((double) zero/n);



    }


}

