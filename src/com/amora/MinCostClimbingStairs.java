package com.amora;

public class MinCostClimbingStairs {


    private int getAtIndex (int[] cost, int index) {
        if (index >= cost.length) {
            return 0;
        }
        return cost[index];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] minimumAt = new int[cost.length + 1];

        minimumAt[0] = cost[0];
        minimumAt[1] = cost[1];

        for(int index = 2; index <= cost.length; index++) {
            minimumAt[index] = Math.min(minimumAt[index - 1], minimumAt[index - 2]) + getAtIndex(cost, index);
        }

        return minimumAt[cost.length];
    }

    public static void main(String[] args) {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int[] cost2 = {0,1,2,2};
        int[] cost3 = {10,15,20};
        int[] cost4 = {1,100};

        System.out.print(minCostClimbingStairs.minCostClimbingStairs(cost) + "\n");
        System.out.print(minCostClimbingStairs.minCostClimbingStairs(cost2) + "\n");
        System.out.print(minCostClimbingStairs.minCostClimbingStairs(cost3) + "\n");
        System.out.print(minCostClimbingStairs.minCostClimbingStairs(cost4) + "\n");
    }
}