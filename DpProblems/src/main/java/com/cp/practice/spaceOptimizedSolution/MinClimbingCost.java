package com.cp.practice.spaceOptimizedSolution;

import java.util.Scanner;

public class MinClimbingCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of stairs - ");
        n = Integer.parseInt(sc.next());

        System.out.println("Enter the cost of numbers - ");
        int[] cost = new int[n];

        for(int i=0; i<n; i++){
            cost[i] = Integer.parseInt(sc.next());
        }

        int costFromN_1 = cost[1];
        int costFromN_2 = cost[0];
        int costFromN = 0;

        for(int i=2; i<n; i++){
            costFromN = cost[i] + Math.min(costFromN_1, costFromN_2);
            costFromN_2 = costFromN_1;
            costFromN_1 = costFromN;
        }

        int minCost = Math.min(costFromN, costFromN_2);

        System.out.println("Minimum cost to climb the top - " + minCost);
    }
}
