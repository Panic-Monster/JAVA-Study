package com.jayson.Array;

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

    public static void main(String[] args) {
        test3();
    }
}
