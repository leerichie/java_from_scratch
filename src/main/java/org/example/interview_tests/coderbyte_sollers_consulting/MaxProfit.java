package org.example.interview_tests.coderbyte_sollers_consulting;

import java.util.Scanner;

public class MaxProfit {
    public static int[] maxProfitWithArr(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = -1;

        for (int j : prices) {
            if (j < minPrice) {
                minPrice = j;
            } else if (j - minPrice > maxProfit) {
                maxProfit = j - minPrice;
            }
        }
        if (maxProfit == -1){
            return prices;
        } else {
            return new int[]{maxProfit};
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        int [] prices = new int[size];

        System.out.println("Enter array of Integers:");
        for(int i=0; i < size; i++){
            prices[i] = s.nextInt();
        }
        int[] maxProfit = maxProfitWithArr(prices);     // WRONG

        System.out.println("Max profit: " + maxProfit);
    }
}
