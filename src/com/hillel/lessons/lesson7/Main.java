package com.hillel.lessons.lesson7;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];
//
//        array[0] = 1;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//
//        int[] array2 = {1, 2};
//        int[] array3 = new int[] {1, 2, 3, 4, 5};
//
//        System.out.println(array.length);   // чтоб узнать длинну массива
//        System.out.println(array2.length);
//        System.out.println(array3.length);

//        int[] array = new int[5];

//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//        System.out.println(array);
//        for (int i = 0; i < array.length; i++) {
//           array[i] = (i + 1);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
//
//        System.out.println(Arrays.toString(array));

        int[] array = {1, 2, 3, 4, 5};

//        for (int value : array) {
//            System.out.println(value);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                array [i] = 99;
        }
        }

        System.out.println(Arrays.toString(array));
    }
}
