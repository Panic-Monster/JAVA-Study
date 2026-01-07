package com.jayson.ProcessControl;

import java.util.Scanner;

/**
 * @author: Jayson_Y
 * @date: 2025/12/30
 * @project: Java_Study
 */
public class SwitchExercise {

    public static void exercise1() {
        /*
          1.使用switch把小写类型的char型转为大写（键盘输入）。只转换a,b,c,d,e.其它的输出"other“。
         */
        Scanner myScanner = new Scanner(System.in);
        char input = myScanner.next().charAt(0);
        switch (input) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
        }
    }

    public static void exercise2() {
        /*
           2.对学生成绩大于60分的，输出"合格”。低于60分的，输出"不合格”。（注：输入的成绩不能大于100)，提示 成绩/60
         */
        Scanner myScanner = new Scanner(System.in);
        double input = myScanner.nextDouble();
        switch ((int)input / 60) {
            case 0:
                System.out.println("不合格");
                break;
            case 1, 2:
                System.out.println("合格");
                break;
        }
    }

    public static void exercise3() {
        /*
          3.根据用于指定月份，打印该月份所属的季节。3,4,5春季6,7,8夏季9,10,11秋季12,1,2冬季[课堂练习，提示使用穿透]
         */
        Scanner myScanner = new Scanner(System.in);
        int month = myScanner.nextInt();
        switch (month) {
            case 3, 4, 5:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏季");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
            case 12,1,2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("other");
        }
    }

    public static void main(String[] args) {
        exercise3();
    }
}
