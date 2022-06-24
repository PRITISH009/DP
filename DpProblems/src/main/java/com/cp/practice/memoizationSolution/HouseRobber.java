package com.cp.practice.memoizationSolution;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {

    public static int rob(int[] house, int[] mem, int numHouses) {
        if(mem[numHouses] == -1){
            mem[numHouses] = Math.max(
                    house[numHouses-1] + rob(house, mem, numHouses-2),
                    house[numHouses-2] + rob(house, mem, numHouses-3)
            );
        }
        return mem[numHouses];
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of houses - ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        System.out.println("Enter the money in each house - ");
        int[] house = new int[n];
        int[] mem = new int[n+1];

        for(int i=0; i<n; i++) house[i] = Integer.parseInt(sc.next());

        Arrays.fill(mem, -1);

        mem[0] = 0;
        mem[1] = house[0];
        mem[2] = Math.max(house[0], house[1]);

        System.out.println("The max money that can be stolen - " + rob(house, mem, n));
    }
}
