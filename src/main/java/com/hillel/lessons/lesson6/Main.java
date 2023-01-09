package com.hillel.lessons.lesson6;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//
// //       for (блок инициализации итератора;
// //       блок условия выхода из цикла;
////        блок смены итератора (++ или --)
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello world");
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("hk");
//        }
//
//        for (int i = 1; i <= 10; i++) {    // ++ увеличивает на 1
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 10; i += 5) {   //увеличивает на 5, потом отправляет опять на проверку
//            System.out.println(i);
//        }
//
//   //     for (int i = 1; true ; i++) {      вечный цикл, тк проверка всегда true
//   //         System.out.println(i);
//   //     }
//
//        int i = 0;
//        for ( ; ; ) {
//            if ( i == 10) {               //      break  оператор обрывания всего цикла
//                break;
//            }
//
//            i++;
//
//            if (i == 5 || 1 == 7) {        //      continue обрывает текущую итерацию и опять запускает (тут пропускаем 5 и 7)
//                continue;
//            }
//
//            System.out.println(i);
//
//        }

        for (int j = 1; j <= 10; j++) {
            if (j == 5 || j == 7) {
                continue;
            }
            System.out.println(j);
        }

//        1) виведення лише парних за допомогою for (з 0 до 20)
        for (int a = 0; a <= 20; a += 2) {
            System.out.println(a);
        }

        for (int b = 0; b <= 20; b++) {
            if (b % 2 != 0) {
                continue;
            }
            System.out.println(b);
        }

        int x = 1;
        while (x <= 10) {                  // while (блок умови виходу з циклу) {.....}
            System.out.println(x);
        }



    }
}
