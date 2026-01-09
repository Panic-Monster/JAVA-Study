package com.jayson.Recursion;

/**
 * @author: Jayson_Y
 * @date: 2026/1/9
 * @project: Java_Study
 */
public class Recursion01 {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        // int result = recursion.fibonacci(7);
        // System.out.println(result);
        int result = recursion.monkeyEatPeach(1);
        System.out.println(result);
    }
}

class Recursion {
    public int fibonacci(int n) {
        /*
        请使用递归的方式求出斐波那契数1,1,2,3,5,8,13... 给你一个整数n,求出他的值是多少
         */
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int monkeyEatPeach(int day) {
        /*
        猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个，以后每天猴子都吃其中的一半，然后再多吃一个。
        当到第10天时，想再吃时发现只有1个桃子了。问题：最初共多少个桃子？

        思路分析：逆推
        1. day = 10 时，有 1 个桃子
        2. day = 9 时，有 (day10 + 1) * 2 = 4
        2. day = 8 时，有 (day9 + 1) * 2 = 10
         */
        if (day == 10) {
            return 1;
        } else {
            int temp = (monkeyEatPeach(day + 1) + 1) * 2;
            System.out.println("当前是第" + day + "天,还剩" + temp + "个桃子");
            return temp;
        }
    }

}
