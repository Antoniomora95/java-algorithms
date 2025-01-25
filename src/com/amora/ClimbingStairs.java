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

        long memo = Runtime.getRuntime().totalMemory() / 1000000;
        System.out.printf("climbStairs takes %s megabytes \n", memo);

        return memory;
    }

    public int climbStairs2(int n) {
        int beforePrev = 1;
        int prev = 1;
        int current = 0;
       for(int i = 2; i <=n; i++) {
           current = beforePrev + prev;
           beforePrev = prev;
           prev = current;
       }
       long memory = Runtime.getRuntime().totalMemory() / 1000000;
       System.out.printf("climbStairs2 takes %s megabytes \n", memory);
       return current;
    }

    public static void main(String[] args){
        //ClimbingStairs stairsAlgorithm = new ClimbingStairs();
    }
}

