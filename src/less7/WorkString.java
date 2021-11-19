package less7;

public class WorkString {
        int dnaCode;
        public boolean equals(WorkString man) {
            return this.dnaCode ==  man.dnaCode;
        }

    public static void main(String[] args) {
        /*String str1 = "Java"; // нахождение длины строк.
        System.out.println(str1.length());


        String strll = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); // перевод строки обратно в массив
        char[] helloArray = strll.toCharArray();

        String s = "";   //  метод проверить строку на пустоту - isEmpty()
        if (s.isEmpty()) System.out.println("String is empty");*/


        WorkString man1 = new WorkString();
                man1.dnaCode = 1111222233;

        WorkString man2 = new WorkString();
                man2.dnaCode = 1111222233;

                System.out.println(man1.equals(man2));

            }
        }






// Строка -  последовательность символов. Это ссылка на часть памяти, где расположены символы. Объект String является неизменяемым
// (любое изменение  - новая строка и ссылка).
//  Оператор == сравнивает не свойства объектов, а ссылки. Equals() принадлежит классу Object самому главному классу в Java
// Ключевое слово native означает, что реализация данного метода выполнена на другом языке
