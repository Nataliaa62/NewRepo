
package less3;

import sun.security.mscapi.CPublicKey;

import java.util.Arrays;

    public class ArrayClass2 {
        public static void main(String[] args) {

        /*
        Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
         */
            int[] arrayNullAndOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arrayNullAndOne.length; i++) {
                if (arrayNullAndOne[i] == 1) {
                    arrayNullAndOne[i] = 0;
                } else {
                    arrayNullAndOne[i] = 1;
                }
            }
            System.out.println(Arrays.toString(arrayNullAndOne));
            System.out.println();

        /*
        Задание 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
        его значениями 1 2 3 4 5 6 7 8 … 100;
        */
            int[] arrayHundred = new int[100];
            for (int i = 0; i < arrayHundred.length; i++) {
                arrayHundred[i] = i + 1;
            }
            System.out.println(Arrays.toString(arrayHundred));
            System.out.println();

        /*
        Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
        */
            int[] arraySix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arraySix.length; i++) {
                if (arraySix[i] < 6) {
                    arraySix[i] = arraySix[i] * 2;
                }
            }

            System.out.println(Arrays.toString(arraySix));
            System.out.println();

        /*
        Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов
         равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        */

            int[][] arraySquare = new int[7][7];
            for (int i = 0; i < arraySquare.length; i++) {
                for (int j = 0; j < arraySquare.length; j++) {
                    if (i + j == arraySquare.length-1 | i==j) {
                        arraySquare[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < arraySquare.length; i++) {
                for (int j = 0; j < arraySquare.length; j++) {
                    System.out.print(arraySquare[i][j] + "\t");
                }
                System.out.println();
            }

        /*  Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        */

            printArray(twoArgs(8, 9));

        }

        public static int[] twoArgs(int len, int initialValue) {
            int[] tmp = new int[len];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = initialValue;
            }
            return tmp;
        }

        public static void printArray(int[] inputArray) {
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + " > ");
            }


        }

        // Вспомогательный метод для расспечатки массива одномерного

        public static void printArray (String msg, int[]Array) {
            // for (i = 0; i < Array.length; i ++) {
                System.out.println();
            }
        }
        // 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
//7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
      //  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//**Примеры:
    //    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     //   checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     //   checkBalance([1, 2, 4]) → false
       // граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.





