package less2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        checkLimit(2, 5);
        checkNumber(-6);
        checkNegativ(6);
        printN("Hello", 3);
        whichYear(5);

    }

    public static boolean checkLimit(int a, int b) {   //Задание 1.
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber (int a) {           //Задание 2.
       if (a >= 0) {
           System.out.println(a + "  являетя Положительным числом");
       } else {
           System.out.println ( "(" + a + ")" + " является Отрицательным числом");
       }
    }



    public static boolean checkNegativ(int a) {         //Задание 3.
        if (a > 0) {
            return true;
        } else  {
            return false;
        }
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
        if ((c == 0 | b == 0) & (b == 0 | d !=0))  {

            // я, с Вашего позволения, видоизменила задание - не использовала return, чтобы программа была более наглядной
            System.out.println(years + " год  - високосный");

        } else {
            System.out.println(years + " год  - неВисокосный");
        }

    }

}





