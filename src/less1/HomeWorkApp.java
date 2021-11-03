package less1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();

        System.out.println("****************************************");


        if (checkSumSign(10,5)) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        };

        System.out.println("****************************************");


        System.out.println (printColor(56));
        System.out.println (printColor(-4));

        System.out.println("****************************************");

        if (compareNumbers(5,6)) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    // Задание 1. Мой вариант
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

// Задание 2. Мой вариант
//    public  static void checkSumSign () {
//        int a = 450;
//        int b = -350;
//        int c = a + b;
//        if (c >= 0){
//            System.out.println("Сумма положительная");
//        } else {
//            System.out.println("Сумма отрицательная");
//        }
//
//    }

    // Задание 2. Вариант Александра
    public  static boolean checkSumSign (int a, int b) {
        return a + b>=0;
    }



    // Задание 3. Мой вариант
    public static void printColor () {
        int value = 340;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
        System.out.println("Зеленый");
        }

    }

    // Задание 3. Вариант Александра
    public static String printColor (int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value <= 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }

    }

// Задание 4. Мой вариант
//  public static void compareNumbers() {
//        int a = 16;
//      int b = 15;
//        if (a >= b){
//        System.out.println("a>=b");
//        } else {
//            System.out.println("a<b");
//        }
//


    // Задание 4. Вариант Александра
    public static boolean compareNumbers(int a, int b) {
        return a >= b;

    }



}



