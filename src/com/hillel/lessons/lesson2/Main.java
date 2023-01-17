package com.hillel.lessons.lesson2;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        char charVariable = 'A';
        char charVariable2 = 65;
        char charVariable3 = '\u00B0' ;
        char charVariable4 = '\u5143' ;

        System.out.println(charVariable);
        System.out.println(charVariable2);
        System.out.println(charVariable3);
        System.out.println(charVariable4);

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        System.out.println(booleanTrue);
        System.out.println(booleanFalse);

        String str = "Hello";
        System.out.println(str);

        int someIntVariable = 10;
        int age = 20;

        byte byte1 = 127;
        short short1 = byte1;
        System.out.println(short1);

        char charA = 'A';
        int intA = charA;
        System.out.println(intA);

        int age2 = 28;
        double ageDouble = age2;
        System.out.println(ageDouble);

        byte byte2 = 127;
        double double2 = byte2;
        System.out.println(double2);

        int x = 129;
        byte y = (byte) x;
        System.out.println(x);
        System.out.println(y);


        double a = 65.56748396;
        System.out.println((int) a);




        final double PI = 3.1415999;
        System.out.println(PI);

        double x1 = 27.1745895;
        System.out.println("North:" + x1 + "°");


    }



}
