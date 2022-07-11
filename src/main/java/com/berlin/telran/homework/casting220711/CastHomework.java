package com.berlin.telran.homework.casting220711;

import java.util.Scanner;

public class CastHomework {

    public static void main(String[] args) {

//        1. Выведите на экран строку "3 cups", полученную из числа 3.9 и строки "cups",
//        используя преобразования типов, и конкатенацию.
//
//        double a = 3.9;
//        int a1 = (int) a;
//        String b = "cups";
//
//        System.out.println( a1 + " " + b );


//    2/ Выведите на экран строку "4 cups", полученную из числа 3.9 и строки "cups", используя округление, и конкатенацию.
//        double c = 3.9;
//        int c1 = (int) Math.round(c);
//
//        System.out.println(c1 + " " + b );
//
//
////        3/ Используя переменные только типа данных char вывести в консоль "Hello <ваше имя>"
////        (в треугольных скобках должно быть ваше имя)
//
//        char ch1 = 'N';
//        char ch2 = 'a';
//        char ch3 = 'd';
//        char ch4 = 'i';
//        char ch5 = 'i';
//        char ch6 = 'a';
//        System.out.println( "Hello " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 );

//
//       4/  Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки,
//        и брала только те, в которых ровно M орешков.
//        Также известно, что для пропитания зимой ей необходимо не менее K орешков.
//        Определите, хватит ли на зиму орешков белочке.
//                Используйте Scanner для ввода N, M, K. Используйте if-else для вывода: если хватит на зиму,
//                то выведите в консоль YES, иначе NO.
//                пример: N = 3, M = 2, K = 1 - вывод YES; N = 4, M = 5, K = 21 - вывод NO;


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How many cones with nuts did the squirrel get?");
//        int N = sc.nextInt();
//
//        System.out.println("How many nuts are in each cone?");
//        int M = sc.nextInt();
//
//        int K = 40 ;
//        int doneNutt = N*M;
//
//                if (doneNutt > K) {
//                    System.out.println("YES");
//        } else if (doneNutt < K ){
//            System.out.println("NO");
//
//        }
//
//       5/ Напишите метод, который принимает в качестве параметра любую строку. Выведите в консоль первый символ из этой строки.
//        Используйте <строка из параметра>.charAt(0);
//        пример: str = "Aleks" - передал в метод str, в методе используя str.charAt(0); распечатал в консоль A

        String name = "Nadiia";
                name.charAt(0);
        System.out.println(name.charAt(0));


    }
}
