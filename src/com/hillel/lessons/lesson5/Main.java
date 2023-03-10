package com.hillel.lessons.lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b =10;
// boolean (result is always true of false)
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);


        boolean isBigger = a > b;
        System.out.println(isBigger);

        boolean booleanTrue = true;
        System.out.println(!booleanTrue);  //exclamation mark changes to an opposite result

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }


        if (a > b) {
            System.out.println("a > b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
        if (a == b) {
            System.out.println("a == b");
        }

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");     // 'else' is always at the end and you can only have 1 'else'
        }

        int c = 1;
        int d = 2;
        int e = 3;

        if (c < d || d > e) {              //  "||" - means OR
            System.out.println("Hello");
        }
        if (c < d && d > e) {              //  "&&" - means AND
            System.out.println("Hello!");
        }

        if (a > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println(a > b ? "YES" : "NO");    // ":" is used instead of "else" ; "?" (тернарний оператор)

        if (a == 1) {
            System.out.println("do something 1");
        } else if (a == 2) {
            System.out.println("do something 2");
        } else if (a == 3) {
            System.out.println("do something 3");
        } else if (a == 4) {
            System.out.println("do something 4");
        } else if (a == 5) {
            System.out.println("do something 5");
        } else if (a == 6) {
            System.out.println("do something 6");
        }

        switch (a) {
            case 1: {                                  // same thing as (a == 1)
                System.out.println("do something 1");
                break;
            }
            case 2: {
                System.out.println("do something 2");
                break;
            }
            case 3: {
                System.out.println("do something 3");
                break;
            }
            case 4: {
                System.out.println("do something 4");
                break;
            }
            case 5: {
                System.out.println("do something 5");
                break;
            }
        }



        switch (a) {
            default: {                // default is used instead of 'else', default can be used in any part of the code
                System.out.println("do default");
                break;
            }
            case 2: {
                System.out.println("do something 2");
                break;
            }
            case 3: {
                System.out.println("do something 3");
                break;
            }
            case 4: {
                System.out.println("do something 4");
                break;
            }
        }

        String str = "QWERTY";
        switch (str) {
            case "QWERT" : {
                System.out.println("1");
                break;
            }
            case "Q" : {
                System.out.println("2");
                break;
            }
            case "QWERTY" : {
                System.out.println("3");
                break;
            }
        }

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter integer");
        int value = scanner.nextInt();
        System.out.println("value = " + value);

        String next = scanner.next();  // читает до пробела, остальное остается в буфере и будет использовано в следующем нексте
        System.out.println("next =" + next);

        String next2 = scanner.next();
        System.out.println("next2 =" + next);

        String next3 = scanner.nextLine();  // читает весь ряд
        System.out.println("next3 =" + next3);

        scanner.nextLine();    // to clear buffer after int values before string values to avoid "\n"


        if (scanner.hasNextInt()) {
            int value1 = scanner.nextInt();
            System.out.println("value = " + value);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);  //to end the program "System.exit(0)"
        }

    }
}
