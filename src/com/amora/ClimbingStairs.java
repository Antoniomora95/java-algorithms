package com.amora;

import java.util.HashMap;
import java.util.Map;
public class ClimbingStairs {
    Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n<=1) {
            return 1;
        }
        var memory = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, memory);
        return memory;
    }

    public static void main(String[] args){
        ClimbingStairs stairsAlgorithm = new ClimbingStairs();
        var start = System.currentTimeMillis();
        System.out.printf("here is the result: %s \n", stairsAlgorithm.climbStairs(45));
        System.out.println( System.currentTimeMillis() - start);
    }
}

