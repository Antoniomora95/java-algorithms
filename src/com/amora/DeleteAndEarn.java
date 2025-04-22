package com.amora;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteAndEarn {

    private int getSafeAt(int[] prevResults, int index) {
        if (index < 0) {
            return 0;
        }
        return prevResults[index];
    }

    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> totals = new HashMap<>();
        for (int num : nums) {
            if (!totals.containsKey(num)) {
                totals.put(num, num);
            } else {
                totals.put(num, totals.get(num) + num);
            }
        }
        List<Integer> ordered = totals.keySet()
                .stream()
                .sorted(Integer::compare)
                .collect(Collectors.toList());

        int amountUniques = ordered.size();
        int[] results = new int[amountUniques];

        for (int i = 0; i < amountUniques; i++) {
            int unique = ordered.get(i);
            int total = totals.get(unique);
            if (i < 1) {
                results[i] = total;
                continue;
            }
            boolean isOneAbove = unique - 1 == ordered.get(i - 1);
            // if there is a difference of 1 between 2 items, then
            // you cannot sum them together? you have to go 2 and 3 places before
            results[i] = Math.max(
                    getSafeAt(results, i - 2),
                    getSafeAt(results, i - (isOneAbove ? 3 : 1))
            ) + total;

        }
        return amountUniques > 1 ? (
                Math.max(results[amountUniques - 1], results[amountUniques - 2])
        ) : results[amountUniques - 1];
    }

    public static void main(String[] args) {
        DeleteAndEarn algo = new DeleteAndEarn();
        System.out.println(algo.deleteAndEarn(new int[]{1, 1, 1, 2, 4, 5, 5, 5, 6}));
    }
}
// similar approach to house robber
// you look back to previous results
// [1,1,1,1,1,2,3,3,4,5]
//[1,2,3, 4, 5]
//[5,2,11,9,16]

//[1,1,1,2,4,5,5,5,6]
//[1,2,4,5,6]
//[3,2,7,18,13]


//[2,2,3,3,3,4]
//[2,3,4]
//[4,9,8]

//[8,10,4,9,1,3,5,9,4,10]
//[1,3,4,4,5,8,9,9,10,10]
//[1,3,9,8,17,27,37]

//[1,1,3,3,4,6,8,10]
//[1,3,4,6,8,10]
//[2,6,6,12,20,30]
