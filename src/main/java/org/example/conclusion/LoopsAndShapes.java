package org.example.conclusion;

import java.util.Scanner;

public class LoopsAndShapes {
    public static void main(String[] args) {

        timesTable();

        leftTriangle();
        rightTriangle();

        rightTriInverted();
        leftTriInverted();

        leftTriangleEdge();
        rightTriangleEdge();

        xmasTreeShape();

        String isoTri = isoscelesTriangle(10);      // with StringBuilder
        System.out.println(isoTri);

        rhombusLeft();

        square();

    }

    static int scanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = input.nextInt();
        return size;
    }

    static void square() {
        int size = scanner();
        String topBottomRow = "";
        for (int i = 0; i < size; i++) {
            topBottomRow += "* ";
        }
        String middleRows = "";
        for (int i = 0; i < size - 2; i++) {
            String row = "*";

            for (int j = 0; j < size - 2; j++) {    // add SPACE to rows
                row += "  ";
            }
            row += " *\n";  // alignment
            middleRows += row;
        }
        System.out.println(topBottomRow);
        System.out.print(middleRows);   // print without blank line
        System.out.println(topBottomRow);
    }

    private static void rhombusLeft() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.format("%2s", "");
            }
            for (int k = 10; k >= 1; k--) {
                System.out.format("%2s", "*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void timesTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.format("%4d", j * i);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void leftTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.format("%2s", "");
            }
            for (int k = 1; k <= i; k++) {
                System.out.format("%2s", "*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void rightTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%2s", "*");
            }
            System.out.format("%2s", "\n");
        }
        System.out.println();
    }

    private static void rightTriInverted() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.format("%2s", "*");
            }
            System.out.format("%2s", "\n");
        }
        System.out.println();
    }

    private static void leftTriInverted() {
        for (int i = 10; i >= 1; --i) {
            for (int space = 1; space <= 10 - i; ++space) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void leftTriangleEdge() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.format("%2s", "");
            }
            System.out.println("*");
        }
        System.out.println();
    }

    private static void rightTriangleEdge() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%2s", "");
            }
            System.out.println("*");
        }
        System.out.println();
    }

    private static void xmasTreeShape() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.format("%2s", "");
            }
            for (int k = 1; k <= (i * 2); k++) {
                System.out.format("%2s", "*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String isoscelesTriangle(int N) {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= N; r++) {
            //   result.append(" ".repeat(Math.max(0, N - r)));
            //   result.append("*".repeat(Math.max(0, (r * 2) - 1)));
            //   result.append(System.lineSeparator());
            for (int sp = 1; sp <= N - r; sp++) {
                result.append(" ");
            }
            for (int c = 1; c <= (r * 2) - 1; c++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}