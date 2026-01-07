package com.jayson.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Jayson_Y
 * @date: 2026/1/4
 * @project: Java_Study
 */
public class Array2 {

    public static void arrayReduce() {
        Scanner scanner = new Scanner(System.in);
        char flag = ' ';
        int[] arr = {1, 2, 3, 4, 5};
        do {
            System.out.println("====当前数组包含的值如下====");
            for (int j : arr) {
                System.out.print(j+"\t");
            }
            System.out.println("是否删除最后一个数（Y/N）");
            flag = scanner.next().charAt(0);
            if (flag == 'N') {
                break;
            }
            int[] newArr = new int[arr.length - 1];
            if(newArr.length == 1){
                System.out.println("只剩一个数了，无法删除,终止程序");
                break;
            }
            System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
            arr = newArr;
        } while (true);
    }

    public static void main(String[] args) {
        arrayReduce();
    }
}
