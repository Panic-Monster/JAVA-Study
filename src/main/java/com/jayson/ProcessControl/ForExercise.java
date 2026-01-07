package com.jayson.ProcessControl;

/**
 * @author: Jayson_Y
 * @date: 2025/12/30
 * @project: Java_Study
 */
public class ForExercise {

    public static void exercise1() {
        /*
        打印1-100之间所有是9的倍数的整数，统计个数 及 总和
         */
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                sum += i;
                num += 1;
                System.out.println(i);
            }
        }
        System.out.println("sum = " + sum + ", num = " + num);
    }

    public static void exercise2() {
        /*
        完成下面的表达式输出
        0 + 5 = 5
        1 + 4 = 5
        2 + 3 = 5
        3 + 2 = 5
        4 + 1 = 5
        5 + 0 = 5
         */
        for (int i = 0, j = 5; i <= 5; i++, j--) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
    }

    public static void main(String[] args) {
        exercise2();
    }
}
