package com.cp.practice.memoizationSolution;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostClimbing {
    public static int[] mem = new int[1001];

    static {
        Arrays.fill(mem, -1);
        mem[0] = 0;
        mem[1] = 0;
    }

    public static int minCostClimbingStairs(int[] cost, int stairsLeft) {
        if(mem[stairsLeft] == -1) {
            mem[stairsLeft] = Math.min(
                    cost[stairsLeft - 1] + minCostClimbingStairs(cost, stairsLeft - 1),
                    cost[stairsLeft - 2] + minCostClimbingStairs(cost, stairsLeft - 2)
            );
        }
        return mem[stairsLeft];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of stairs - ");
        n = Integer.parseInt(sc.next());

        System.out.println("Enter cost for each stair - ");
        int[] cost = new int[n];

        for(int i=0; i<n; i++) cost[i] = Integer.parseInt(sc.next());

        System.out.println("The Min Cost - " + minCostClimbingStairs(cost, n));

    }
}
