package com.cp.practice.tabulationSolution;

import java.util.Scanner;

public class MinCostClimbing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the num of stairs - ");
        n = Integer.parseInt(sc.next());

        int[] cost = new int[n];

        System.out.println("Enter Cost for each stair - ");
        for(int i=0; i<n; i++) cost[i] = Integer.parseInt(sc.next());

        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<n; i++){
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        int minCost = Math.min(dp[cost.length-1], dp[cost.length-2]);

        System.out.println("Minimum Cost to climb stairs - " + minCost);
    }

}
