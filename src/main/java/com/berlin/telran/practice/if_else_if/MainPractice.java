package com.berlin.telran.practice.if_else_if;

public class MainPractice {
    public static void main(String[] args) {
        int a = 31;
        if (a > 30 && a < 50 && a != 40 ) { // 31-> 49 and !=40
            System.out.println("number from 30 to 50 and not equal to 40 ");
        }


        int b = 12;
        if ((b < 10 || b > 40) && (b < 20 || b > 30)) { // or  .... исключаем цыфра от 10 до 40
            System.out.println("number is less then 10 or greater then 40");
        }
     String language = null;

         printLanguage(language);


    }

    private static void printLanguage(String language) {
// ru, en, ua

        if (language == null) {
            System.out.println("Language have to not null!!!");
            return;
        }



//        if ( language != null && language.equals("ru")) {
//            System.out.println("user chosen Russian language");
//
//        }

        if (language.equals("ru")) {
            System.out.println("user chosen Russian language");

        }

       else if (language.equals("en")) {
            System.out.println("user chosen English language");

        }

       else if (language.equals("ua")) {
            System.out.println("user chosen Ukrainian language");
        } else {
            System.out.println("wrong language");
        }
    }
}
