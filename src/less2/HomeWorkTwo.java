package less2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        checkLimit(2, 5);
        checkLimitAl(3,6);
        checkNumber(-6);
        checkNegativ(6);
        printN("Hello", 3);
        whichYear(5);
        whichYearAl(2000);

    }

    public static boolean checkLimit(int a, int b) {   //Задание 1. \\это ошибка, тавтология с тру тру
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkLimitAl(int a, int b) {   //Задание 1.

        return (a + b >= 10 && a + b <= 20);
    }

    public static void checkNumber (int a) {           //Задание 2.
       if (a >= 0) {
           System.out.println(a + "  являетя Положительным числом");
       } else {
           System.out.println ( "(" + a + ")" + " является Отрицательным числом");
       }
    }



    public static boolean checkNegativ(int a) {         //Задание 3.
        if (a <= 0) {
            return true;
        } else  {
            return false;
        }
    }

    public static boolean checkNegativAl(int a) {         //Задание 3. опять тавтология и в задании надо вернуть отриц.число тру, а уменя положит. (поменяли знак)
        return (a >= 0);
        }



    public static void printN(String name, int a) {     //Задание 4.
        for (int i= 0; i < a; i++) {
            System.out.println(name);
        }



    }
    public static void whichYear(int years) {          // Задание 5
// правило для Високосного года - деление без остатка на 4;
        int c = years % 4;

// правило для Високосного года - деление без остатка на 400;
        int b = years % 400;

// правило для неВисокосного года - деление на 100;
        int d = years % 100;

// год должен выполнять одновременно хотя бы одно условие из скобочек:
        if ((c == 0 | b == 0) & (b == 0 | d != 0)) {

            // я, с Вашего позволения, видоизменила задание - не использовала return, чтобы программа была более наглядной
            System.out.println(years + " год  - високосный");

        } else {
            System.out.println(years + " год  - неВисокосный");
        }
    }


        public static boolean whichYearAl(int years) {          // Задание 5
        return (years % 4 ==0) && (years % 100 != 0) || (years % 400 == 0);


    }

}





