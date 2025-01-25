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
            Integer prevValue = totals.get(num);
            if (Objects.isNull(prevValue)) {
                totals.put(num, num);
            } else {
                totals.put(num, prevValue + num);
            }
        }
        List<Integer> ordered = totals.keySet()
                .stream()
                .sorted(Integer::compare)
                .collect(Collectors.toList());

        int amountUniques = ordered.size();
       int[] results = new int[amountUniques];

        for (int i = 0; i < amountUniques; i++) {
            int keyNumber = ordered.get(i);
            if(i == 0) {
                results[i] = totals.get(keyNumber);
                continue;
            }
            boolean isOneAbove = keyNumber - 1 == ordered.get(i-1);
            if (isOneAbove) {
                results[i] = Math.max(
                        getSafeAt(results, i - 2),
                        getSafeAt(results, i - 3)
                ) + totals.get(keyNumber);
            } else {
                results[i] = Math.max(
                        getSafeAt(results, i - 1),
                        getSafeAt(results, i - 2)
                ) + totals.get(keyNumber);
            }
        }
        return amountUniques > 1 ? (
                Math.max(results[amountUniques - 1], results[amountUniques - 2])
                ) : results[amountUniques - 1];
    }

    public static void main(String[] args) {
        DeleteAndEarn algo = new DeleteAndEarn();
        System.out.println(algo.deleteAndEarn(new int[]{1,1,1,2,4,5,5,5,6}));
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
