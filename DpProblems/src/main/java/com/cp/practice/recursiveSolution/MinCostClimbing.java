package com.cp.practice.recursiveSolution;

import java.util.Scanner;

public class MinCostClimbing {

    public static int minCostClimbingStairs(int[] cost, int stairsLeft) {
        if(stairsLeft == 0 || stairsLeft == 1) return 0;
        else return Math.min(
                cost[stairsLeft - 1] + minCostClimbingStairs(cost, stairsLeft-1),
                cost[stairsLeft - 2] + minCostClimbingStairs(cost,  stairsLeft-2)
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter number of stairs - ");
        n = Integer.parseInt(sc.next());

        int[] cost = new int[n];
        System.out.println("Enter Cost numbers for each stair - ");
        for(int i=0; i<n; i++){
            cost[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Min Cost - " + minCostClimbingStairs(cost,n));
    }
}
