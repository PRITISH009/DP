package com.cp.practice.recursiveSolution;

import java.util.Scanner;

public class HouseRobber {

    public static int rob(int[] house, int numHouses){
        if(numHouses == 0) return 0;
        else if(numHouses == 1) return house[0];
        else if(numHouses == 2) return Math.max(house[0], house[1]);
        else return Math.max(
                house[numHouses-1] + rob(house, numHouses-2),
                house[numHouses-2] + rob(house, numHouses-3)
            );
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of houses - ");
        Scanner sc =  new Scanner(System.in);
        int n;

        n = Integer.parseInt(sc.next());

        System.out.println("Enter the money in each house - ");
        int[] house = new int[n];

        for(int i=0; i<n; i++) house[i] = Integer.parseInt(sc.next());

        System.out.println("The max money that can be stolen - " + rob(house, n));

    }
}
