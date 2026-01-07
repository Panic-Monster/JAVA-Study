package com.jayson.Exercise;

import java.util.Scanner;

/**
 * @author: Jayson_Y
 * @date: 2026/1/4
 * @project: Java_Study
 */
public class Test1 {

    public static void exercise1() {
        /*
        某人有100000元，每经过一次路口，需要交费，规则如下：
            1、当现金>50000时，每次交5%
            2、当现金<=50000时，每次交1000
        编程计算该人可以经过多少次路口，要求：使用while break 方式完成
         */
        double cash = 100000;
        int count = 0;
        while (true) {
            if (cash > 50000) {
                cash -= cash * 0.05;

            } else {
                cash -= 1000;
            }
            if (cash < 0) break;
            count++;
            System.out.println(cash);
        }
        System.out.println("可以经过" + count + "次路口");

    }

    public static void exercise2() {
        /*
        实现判断一个整数，属于哪个范围：大于0，小于0；等于0
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println(num + "小于0");
        } else if (num == 0) {
            System.out.println(num + "等于0");
        } else {
            System.out.println(num + "大于0");
        }
    }

    public static void exercise3() {
        /*
        判断一个年份是否为闰年
         */
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }

    public static void exercise4() {
        /*
        判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身，例如：153 = 1*1*1 + 3*3*3 + 5*5*5
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        // 百位
        x = num / 100;
        // 十位
        y = num / 10 % 10;
        // 个位
        z = num % 10;
        if (x * x * x + y * y * y + z * z * z == num) {
            System.out.println(num + "是水仙花数");
        } else {
            System.out.println(num + "不是水仙花数");
        }
    }

    public static void exercise6() {
        /*
        输出1-100之间的不能被5整除的数，每5个一行
         */
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + " ");
                count++;
            }
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static void exercise7() {
        /*
        输出小写的a-z以及大写的Z-A
         */
        char letter1 = 'a';
        char letter2 = 'Z';
        for (int i = 0; i < 26; i++) {
            System.out.print(letter1 + " ");
            letter1 = (char) (letter1 + 1);
        }
        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print(letter2 + " ");
            letter2 = (char) (letter2 - 1);
        }
    }

    public static void exercise8() {
        /*
        求出 1-1/2+1/3-1/4。。。1/100的和
         */
        double sum = 0;
        for (double i = 1; i <= 100; i++) {
            double temp = 1 / i;
            if (i % 2 == 0) {
                sum -= temp;
            } else {
                sum += temp;
            }
        }
        System.out.println(sum);
    }

    public static void exercise9() {
        /*
        求 1+（1+2）+（1+2+3）+（1+2+3+4）+。。。+（1+2+3+。。+100）的结果
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                temp += j;
            }
            System.out.print(temp + " ");
            sum += temp;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // exercise1();
        // exercise2();
        // exercise3();
        // exercise4();
        // exercise7();
        // exercise8();
        exercise9();
    }
}
