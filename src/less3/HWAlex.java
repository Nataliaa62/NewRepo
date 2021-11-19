
package less3;

import sun.security.mscapi.CPublicKey;

import java.util.Arrays;

public class HWAlex {
    public static void main(String[] args) {

        /*
        Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
         */
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray1("Before\t", array1);
        change(array1);
        printArray1("After\t", array1);
        System.out.println("***************");


        /*
        Задание 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
        его значениями 1 2 3 4 5 6 7 8 … 100;
        */
        int[] arrayHundred = new int[100];
        sto(arrayHundred);
        printArray1("After: \t", arrayHundred);
        System.out.println("***************");


        /*
        Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
        */
        int[] arraySix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Six(arraySix);
        printArray1("After", arraySix);
        System.out.println("***************");

        /*
        Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов
         равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        */
        int x = 10;
        int[][] arraySquare = new int[x][x];
        diag(arraySquare);
        printArray2("After", arraySquare);

        /*  Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        */

        printArray1("After", twoArgs(8, 9));

        // 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        printArray1("Find min max \t", arraySix);
        System.out.println(findMin(arraySix));

        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//**Примеры:
        //    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        //   checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
        //   checkBalance([1, 2, 4]) → false
        // граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    }


    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " > ");
        }


    }

    // Вспомогательный метод для расспечатки массива одномерного

    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    // Вспомогательный метод для расспечатки массива двумерного

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.println(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++)
                System.out.println(inputArray[i][j] + " ");
        }
        System.out.println();
    }

    //  Метод для замены в массиве 1 задания

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }

        }
    }

    // Метод для создание массива от 0 до 100 2 задания
    public static void sto(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    // Метод для умножения на два меньше шести 3 задания
    public static void Six(int[] arraySix) {
        for (int i = 0; i < arraySix.length; i++) {
            if (arraySix[i] < 6) {
                arraySix[i] = arraySix[i] * 2;
            }
        }
    }

    // Метод диагональ для 4 Задания
    public static void diag(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;

        }
    }

    // Метод для 5 задания
    public static int[] twoArgs(int len, int initialValue) {
        int[] tmp = new int[len];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = initialValue;
        }
        return tmp;
    }


    // * Метод минимальный и максимальный элементы 6 задание;
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    // Метод для 7 задания равенство

   /* public static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++) {
                right += array[j];
                if (left == right) return true;
                right = 0;
            }
            boolean b = false;
            return b;
        }
    }*/
    
}
