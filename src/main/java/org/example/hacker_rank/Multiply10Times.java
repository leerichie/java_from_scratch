package org.example.hacker_rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply10Times {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter multiplier: ");
        int N = Integer.parseInt(br.readLine().trim());
        int i = 1;
        int result;

        do {
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
            i++;
        }
        while (i <= 10);

        br.close();
    }

    public static void main(String[] args) throws IOException {

        solution();
    }
}
