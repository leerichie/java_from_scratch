package org.example.hacker_rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdInStdout2 {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strDouInt = {"String: ", "Double: ", "Int: "};


        String str = br.readLine();
        double db = Double.parseDouble(br.readLine());
        int in = Integer.parseInt(br.readLine());

        System.out.println(strDouInt[0] + str);
        System.out.println(strDouInt[1] + db);
        System.out.println(strDouInt[2] + in);
    }

    public static void main(String[] args) throws IOException {

        solution();
    }

}
