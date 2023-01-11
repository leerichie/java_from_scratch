package org.example.head_first_java_3rd.ch1_dive_in.pg23;

public class MixedMessages {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        while (x < 5) {

            y = x - y;
/* adding up +1
y becomes x
y is 0, x is 0
1and1

 */

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
