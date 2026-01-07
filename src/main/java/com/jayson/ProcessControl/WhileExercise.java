package com.jayson.ProcessControl;

/**
 * @author: Jayson_Y
 * @date: 2025/12/30
 * @project: Java_Study
 */
public class WhileExercise {

    public static void exercise1(){
        /*
        打印1-100之间所有能被3整除的数（使用 while）
         */
        int i = 1;
        while(i <= 100){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void exercise2(){
        /*
        打印40-200之间所有的偶数（使用while）
         */
        int i = 40;
        while(i <= 200){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        // exercise1();
        exercise2();
    }
}
