package org.example.hacker_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QueryPrintSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            queries.add(Arrays.asList(a, b, n));
        }
        printSeries(queries);
    }

    public static void printSeries(List<List<Integer>> queries) {
        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int n = query.get(2);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int sum = a;
                for (int j = 0; j <= i; j++) {
                    sum += (Math.pow(2, j) * b);
                }
                sb.append(sum + " ");
            }
            System.out.println(sb);
        }
    }
}
