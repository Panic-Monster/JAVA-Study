package com.jayson.Method;

/**
 * @author: Jayson_Y
 * @date: 2026/1/9
 * @project: Java_Study
 */
public class MethodParameter02 {

    public static void main(String[] args) {
        // 测试
        // B b = new B();
        // int[] arr = {1, 2, 3, 4, 5};
        // b.test100(arr);
        //遍历数组
        // System.out.println();
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        Person person = new Person();
        person.name="小明";
        person.age=18;

        B b = new B();
        b.test200(person);
    }
}

class Person {
    String name;
    int age;
}

class B {
    // B类中编写一个方法test100
    // 可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
    public void test100(int[] arr) {
        arr[0] = 0;
        //遍历数组
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void test200(Person person) {
        person = null;
        System.out.println(person);
    }
}

