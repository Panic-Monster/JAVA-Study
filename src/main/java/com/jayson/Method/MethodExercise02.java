package com.jayson.Method;

import javax.xml.transform.Source;

/**
 * @author: Jayson_Y
 * @date: 2026/1/9
 * @project: Java_Study
 */
public class MethodExercise02 {

    public static void main(String[] args) {
        // int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MyTools myTools = new MyTools();
        // myTools.printArr(matrix);

        Person person = new Person();
        person.name = "小明";
        person.age = 18;
        Person newPerson = myTools.copyPerson(person);
        System.out.println("===初始的===");
        System.out.print(person + " " + person.name + " " + person.age);
        System.out.println();
        System.out.println("===克隆的===");
        System.out.println(newPerson + " " + newPerson.name + " " + newPerson.age);
    }
}

class MyTools {

    /*
    编写MyTools类，编写一个方法可以打印二维数组的数据
     */
    public void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    编写一个方法copyPerson,可以复制一个Person对象，返回复制的对象。
    克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
     */
    public Person copyPerson(Person person) {
        Person newPerson = new Person();
        newPerson.name = person.name;
        newPerson.age = person.age;
        return newPerson;
    }
}



