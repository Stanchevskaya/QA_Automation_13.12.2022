package com.hillel.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;
////        System.out.println(5 + 10);
//        System.out.println(5 + 10);
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//
////   any number or both should be (double) to get the exact result
//        System.out.println((double) a / b);
//        System.out.println(a / (double) b);
//        System.out.println((double) a / (double) b);
//
////   zalyshok vid dilennya
//        System.out.println(a % b);
//        System.out.println(10 % 2);  // 10/2 = 5; 5*2 = 10; 10-10=0
//        System.out.println(10 % 3);  // 10/3=3; 3*3=9; 10-9=1
//        System.out.println(10 % 4);
//        System.out.println(10 % 5);

        int a = 10;
        int b = 3;

//        a = a + 5;
        a += 5;
        System.out.println(a);
        a += 5 + 10 * 2;
        System.out.println(a);
        a -= 5 + 10 * 2;
        System.out.println(a);
        a *= 5 + 10 * 2;
        System.out.println(a);
        a /= 5 + 10 * 2;
        System.out.println(a);
        a %= 5 + 10 * 2;
        System.out.println(a);

        // priority
        System.out.println(a + b * a - b);
        System.out.println((a + b) * a - b);

        a = a + 1;
        a += 1;
        a++;   // ++ always adds 1, can be added multiple times
        a++;
        a++;
        System.out.println(a);


    }
}
