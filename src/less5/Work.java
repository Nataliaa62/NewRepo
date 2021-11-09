package less5;

import less5.Employees;

public class Work {
    public static void main (String[] args) {
        // Создаем объект сс помощью конструктора класса
        Employees employeesQ = new Employees("Иванов Сергей Дмитриевич", "Тестировщик", "iva@mailbox.com", "892262312", 30000, 38);
        // Распечатываем с помощью метода, созданного в классе
        employeesQ.print();

        System.out.println("***********************");

        //4. Создать массив из 5 сотрудников.
        Employees[] persArray = new Employees[5];
        persArray[0] = new Employees("Сидоров Евгений Николаевич", "Директор", "sid@mailbox.com", "892262312", 90000, 40);
        persArray[1] = new Employees("Кошкин Дмитрий Дмитриевич", "Инженер", "kosh@mailbox.com", "892368412", 30000, 30);
        persArray[2] = new Employees("Елкина Екатерина Олеговна", "Программист", "elk@mailbox.com", "892111412", 40000, 45);
        persArray[3] = new Employees("Суворов Николай Иванович", "Программист", "suv@mailbox.com", "892392312", 50000, 50);
        persArray[4] = new Employees("Куропаткин Сергей Владимирович", "Аналитик", "kur@mailbox.com", "8923171712", 20000, 20);


        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
            for (int i = 0; i < persArray.length; i++) {
                if (persArray[i].getAge()>=40) {
                    persArray[i].print();
            }
        }
    }
}
