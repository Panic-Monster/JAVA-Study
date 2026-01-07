package com.jayson.ProcessControl;

/**
 * @author: Jayson_Y
 * @date: 2025/12/30
 * @project: Java_Study
 */
public class MulForExercise {

    public static void exercise1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (j * i));
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void exercise2() {
        /*
        打印金字塔
        1   1
        2   3
        3   5
         */

        // 层数
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exercise3() {
        /*
        打印空心金字塔
        1   1
        2   3
        3   5


        1   3
        2   2
        3   1
        4   0
         */
        // 层数
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // 打印底层所有*
            if (i == n) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // 打印左边倒置的空三角
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                // 打印空心金字塔
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void exercise4() {
        /*
        打印空心金字塔
        1   1
        2   3
        3   5
        4   7

        1   5
        2   3
        3   1


        1   3
        2   2
        3   1
        4   0
        5   1
        6   2
        7   3
         */
        // 层数
        int n = 5   ;
        for (int i = 1; i <= n; i++) {
            // 打印底层所有*
            if (i == n) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // 打印左边倒置的空三角
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                // 打印空心金字塔
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // 打印左边倒置的空三角
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");
            }
            // 打印空心金字塔
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        exercise4();
    }
}