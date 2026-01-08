package com.jayson.Array;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: Jayson_Y
 * @date: 2026/1/7
 * @project: Java_Study
 */
public class TwoDimensionalArray {

    public static void test1() {
        /*
        int arr[][] = {{4,6},{1,4,5,7},{-2}}; 遍历该二维数组，并得到和
         */
        int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("二维数组和为：" + sum);
    }

    public static void test2() {
        /*
        使用二维数组打印一个 10 行杨辉三角 [1,0] + [1, 1] -> [2, 1]
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 5 4 1
        1 5 10 10 5 1
        ...
         */
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            // 给每个一维数组（行）开空间
            arr[i] = new int[i + 1];
            // 给每个一维数组（行）赋值
            for (int j = 0; j < arr[i].length; j++) {
                // 每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    // 中间元素
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        // 输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void test3() {
        /*
        已知有个什序的数组，要求插入一个元素，该数组顺序依然是升序，比如：[10, 12, 45, 90],添加23后，数组为[10, 12, 23, 45, 90]
         */
        int[] arr = {10, 12, 45, 90};
        System.out.println("===当前数组为===");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要插入的数字：");
        int num = scanner.nextInt();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i == arr.length) {
                newArr[i] = num;
            } else {
                newArr[i] = arr[i];
            }
        }

        // 冒泡排序
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (newArr[i] < newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        System.out.println("===添加后的数组===");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    public static void test4() {
        /*
        随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值、求最小值和最大值的下标、并查找里面是否有8
         */
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(1, 100);
            // System.out.print(num + " ");
            arr[i] = num;
        }
        int avgNum = 0;

        // 倒序打印
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        boolean flag = false;
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            System.out.print(arr[i] + " ");
            if (8 == arr[i]) {
                flag = true;
                System.out.println("生成的随机数里包含8");
            }
            sum += arr[i];
        }
        if (!flag) {
            System.out.println("生成的随机数里不包含8");
        }
        avgNum = sum / arr.length;
        System.out.println("平均值为：" + avgNum);
        System.out.println("最大值的索引为：" + maxIndex + ",值为：" + max);
        System.out.println("最小值的索引为：" + minIndex + ",值为：" + min);
    }

    public static void main(String[] args) {
        test4();
    }
    /*
    a   a
    z   z
    b   韩
    c   c
     */
}
