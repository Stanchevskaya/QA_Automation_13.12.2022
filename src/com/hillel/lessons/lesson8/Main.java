package com.hillel.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 5, -2, 99, 7, -7, 44, -55, 65};

        System.out.println("before sort: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    }
            }
        }

        System.out.println("after sort: "+ Arrays.toString(array));

    }
}
