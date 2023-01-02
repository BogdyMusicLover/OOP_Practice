package org.example.lonelyinteger;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LonelyIntegerClass {
    public static int lonelyInteger(List<Integer> a) {

        int result = 0;
        for (Integer integer : a) {
            int count = 0;
            for (Integer second : a) {
                if (integer.equals(second)) {
                    count++;
                }
            }
            if (count == 1) {
                result = integer;
            }
        }
        return result;
    }

    public static int lonelyInteger2(List<Integer> a) {
        for(Integer i:a){

            if(Collections.frequency(a, i)==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 3, 2, 1);
        System.out.println(lonelyInteger(list));
        System.out.println(lonelyInteger2(list));
    }
}
