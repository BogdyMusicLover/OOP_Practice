package org.example.matchingstrings;

import java.util.ArrayList;
import java.util.List;

public class MatchStringsClass {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> resultList = new ArrayList<>();
        for (String sq : queries) {
            int counter = 0;
            for (String ss : strings)
                if (sq.equals(ss)) {
                    counter++;
                }
            resultList.add(counter);

        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> string = List.of("ab", "ab", "abc");
        List<String> queries = List.of("ab", "abc", "bc");

        List<Integer> resultList = matchingStrings(string, queries);
        System.out.println(resultList);
    }
}
