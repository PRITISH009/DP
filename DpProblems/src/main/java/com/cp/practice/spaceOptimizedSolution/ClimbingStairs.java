package com.cp.practice.spaceOptimizedSolution;

import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n < 3) return n;

        int numClimbN_1 = 2;
        int numClimbN_2 = 1;
        int numWays = 0;

        for(int i=3; i<=n; i++){
            numWays = numClimbN_1 + numClimbN_2;
            numClimbN_2 = numClimbN_1;
            numClimbN_1 = numWays;
        }

        return numWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of stairs to climb - ");
        n = Integer.parseInt(sc.next());

        System.out.println("Number of ways - " + climbStairs(n));
    }
}
