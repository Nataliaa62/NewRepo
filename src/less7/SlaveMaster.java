package less7;

import less5.Point;

import java.util.Scanner;

public class SlaveMaster {
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
/*
        Point point = new Point(20, 65);
        System.out.println(point);  // распечаталось  less5.Point@7ea987ac. где находится родит.объект + ссылка хэшкод
        System.out.println("********************");

        String stringMain = "Java Virtual"; // вводим текст разными способами 4 раза.

        String string1 = "Java";
        string1 += " Virtual";   // конкотенируем - будет новый объект памяти. т.к строка это массив символов. Длину массива нельзя изменить.
                                 // Поэтому создается новый объект, переписываются символы двух массивов.

        String string2 = scanner.nextLine(); // вводим с помощью консоли. создасться новый объект памяти
        String string3 = "Java Virtual";  // записывем иденитично стрингмэйн: джава не будет создавать отдельный объект памяти,
                                          // она сошлется на объект где есть такое же значение, т.ею. СтрингМэйн, поэтому будет тру

        System.out.println(stringMain);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println("********************");

        System.out.println(stringMain == string1); // Оператор == сравнивает не свойства объектов, а ссылки. Поэтому объекты не эквивалентны, кроме
        System.out.println(stringMain == string2); // стринг3 и стрингмэйн (джава присвоила стринг3 ссылку на стрингмэйн)
        System.out.println(stringMain == string3);
        System.out.println("********************");

        System.out.println(stringMain.equals(string1)); // Оператор == сравнивает не свойства объектов, а ссылки. Поэтому объекты не эквивалентны, кроме
        System.out.println(stringMain.equals(string2)); // стринг3 и стрингмэйн (джава присвоила стринг3 ссылку на стрингмэйн)
        System.out.println(stringMain.equals(string3));
*/
        String stringTest1 = "Test";
        StringBuilder stringTest2 = new StringBuilder("Test"); // класс надстройки для работы со строками (облегчает ее). Исп-ся в однопоточ
        long startTime = System.nanoTime(); // берем начальное время

        for (int i = 0; i < 70000; i++) {   // выполняем операцию
            stringTest1 += i;
        }
        float delta = System.nanoTime() - startTime; // высчитываем время на выполение операции
        System.out.println("The test " + delta * 0.000001f + " millisec");
        System.out.println(stringTest1);  // долго потому что каждый раз перезаписывался массив

        // для СтрингВилдер создаем время
        startTime = System.nanoTime(); // берем начальное время

        for (int i = 0; i < 70000; i++) {   // выполняем операцию
            stringTest2.append(i);           // аппенд - это присоединение
        }
        delta = System.nanoTime() - startTime;
        System.out.println("The test " + delta * 0.000001f + " millisec");
        System.out.println(stringTest2.toString());
        System.out.println(stringTest1.equals(stringTest2.toString()));



     }
}




// Строка -  последовательность символов. Это ссылка на часть памяти, где расположены символы. Объект String является неизменяемым
// (любое изменение  - новая строка и ссылка).
// лючевое слово native означает, что реализация данного метода выполнена на другом языке
// метод toString - любой объект можно распечатать. retutn getClass().getName() + "@" + Integner.toHexString(hashCode());
// метод clone - полная копия объекта
// метод hashCode - где находится объект
// метод getClass - что за класс у нашего объекта
// метод registerNatives - регламентриует регистрацию объекта.
// как решить задачу сравнения. все объекты по умолчанию подчиняются классу Object. в нем есть много методов,  т.ч. equals

// метод equals:
/*public boolean equals(Object anObject) {
            if (this == anObject) { // если передали саму себя (как стринг3 и стрингМэйн) занчит тру
                return true;
            }
            if (anObject instanceof String) {     // вопрос а ты стринг (или нет), если нет, то фолс, если да идем дальше
                String anotherString = (String)anObject;
                int n = value.length;              // запрашиваем длину
                if (n == anotherString.value.length) {  // сравниваем длину
                    char v1[] = value;                  // сравнивем каждый символ в массиве  мужду собой
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }*/
// Классы StringBuffer и StringBuilder используются, когда возникает необходимость сделать много изменений в строке символов.
// Класс StringBuffer синхронизированный и потокобезопасный. То есть класс StringBuffer удобнее использовать в
// многопоточных приложениях, где объект данного класса может меняться в различных потоках.
// Если же речь о многопоточных приложениях не идет, то лучше использовать класс StringBuilder,
// который не потокобезопасный, но при этом работает быстрее, чем StringBuffer в однопоточных приложениях.