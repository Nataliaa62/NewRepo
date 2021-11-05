
/*//Задание1.   Спрятать всех врагов, чтобы их при старте не было видно
Ответ:  Александр,  больше чем, заменить Е на "Нижнее подчеркивание" в public static char enemy = '_' я , к сожалению,
не додумалась... (строка 44). С помощью char [][] invisibleLocation не получилось ((

2*) Попытаться придумать многоуровневую системы игры. Т.е. игрок прошел карту, переходит на другую - с учетом, что герой жив
Ответ: в начале запуска main я добавила  условие while (isAliveplayer()) (строка 53). Этот метод перезапускает новую игру
*/

package less4;

import java.util.Random;
import java.util.Scanner;

public class GameCom {
    public static Random random = new Random();     // запускаем код Рандома
    public static Scanner scanner = new Scanner(System.in); // запускаем код для ввода

    // Description Player
    public static char player = 'P';                 // символ героя
    public static String namePlayer = "King Artur";  // задаем переменную  - имя героя
    public static int healthPlayer = 100;            // задаем переменную - здоровье, значение любое
    public static int strPlayer = 10;                // ... силу, значение любое
    public static int xPosPlayer;                    // коордианты по х для героя
    public static int yPosPlayer;                    // коордианты по у для героя
    public static final int moveUpPlayer = 8;        //* движение по направлениям - закодировали с помощью клавиатуры, ставим финал
    public static final int moveLeftPlayer = 4;      //* ставим финал, чтобы было невозможно поменять значения переменных в методе.
    public static final int moveRightPlayer = 6;     // тоже самое
    public static final int moveDownPlayer = 2;      // тоже самое


    // Description Location
    public static char[][] location;                 // локация это двумерный массив, с типом char, т.к. обозначим героя, врага, пустую команту символы
    public static char [][] invisibleLocation;       // не получилось! (
    public static int locWight;                      // задаем высоту
    public static int locHeight;                     // задаем ширину
    public static int LocMin = 3;                    // задаем минимум для рандомного определения ширины и высоты
    public static int LocMax = 3;                    // задаем максимум для рандомного определения ширины и высоты
    public static char emptyRoom = '_';              // символ для пустой команты
    public static char readyRoom = '+';              // символ для пройденной команаты
    public static boolean isRandomStartPointPlayer = false; // выбор расстоновки героя рандомно или в координате 0,0

    // Description Enemy
    public static char enemy = '_';                  // символ для врага
    public static int healthEnemy;                   // здоровье врага (генерируются рандомно)
    public static int strEnemy;                      // сила врага (генерируются рандомно)
    public static int enemyValueMin = 20;            // ограничения мин для генерации силы и здоровья врага
    public static int enemyValueMax = 40;            // ограничения макс для генерации силы и здоровья врага
    public static int countEnemies;                  // количество врага


    public static void main(String[] args) {
        while (isAliveplayer()) {
            System.out.println(namePlayer + ", try new game!");
            createLocation();
            createPlayer(isRandomStartPointPlayer);
            createEnemy();
            printLocation();


            while (true) {
                directionPlayer();
                printLocation();
                if (!isAliveplayer()) {
                    System.out.println(namePlayer + " is dead");
                    break;

                }
                if (isReadyLocation()) {
                    System.out.println(namePlayer + " win!");
                    break;
                }
            }
            System.out.println("GoodBye!Game Over!");
            System.out.println();
        }
    }

    public static void createLocation() {            // метод создания карты
        locWight = myRandomValueInt(LocMin, LocMax); // задаем рандомно ширину
        locHeight = myRandomValueInt(LocMin, LocMax);// задаем рандомно высоту
        location = new char[locHeight][locWight];    //двумерный массив с типом char и заданными рандомно шириной и высотой
        System.out.println("locWidth: " + locWight + " locHeight: " + locHeight); // вывод сообщения в консоли о параметрах карты

        for (int y = 0; y < locHeight; y++) {        // заполняем карту пустыми комантами
            for (int x = 0; x < locWight; x++) {
                location[y][x] = emptyRoom;
            }
        }
    }

    public static void createPlayer(boolean isRandom) {      // метод для расположения героя.
        if (isRandom) {
            xPosPlayer = myRandomValueInt(0, locWight - 1);  // если рандом включен, мин 0 - массив начинается с ноля, и по ширине -1, чтобы не вывалится за пределы карты
            yPosPlayer = myRandomValueInt(0, locHeight - 1); // тоже самое
        } else {
            xPosPlayer = 0;                                  // если рандом выключен, то координаты на клетке массива 0,0
            yPosPlayer = 0;
        }
        location[yPosPlayer][xPosPlayer] = player;           // ставим героя на координаты, вычисленные выше
        System.out.println(namePlayer + " has spawn in room [" + xPosPlayer + ":" + yPosPlayer + "]");  // выводим сообщение о координатах героя
    }

    public static void createEnemy() {                                  // метод для расположения врагов
        countEnemies = (locHeight + locWight) / 2;                      // задаем количество врагов от размера карты
        healthEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);   // создаем случайно здоровье с макс и мин значением, указанным выше
        strEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);      // тоже самое
        int xPosEnemy;                                                  // вводим переменную для расстановки врага по х массива
        int yPosEnemy;                                                  // тоже самое для у

        for (int i = 0; i < countEnemies; i++) {                        //* задаем цикл для расстановки врагов, где кол-во врагов задали
            do {                                                        // с помощью формулы выше. И будем рандомно задавать координаты для врага
                xPosEnemy = random.nextInt(locWight);                   // по х и у. И если ячейка непустая, мы опять возвращаемя к do, пока
                yPosEnemy = random.nextInt(locHeight);                  //* не создадим всех врагов до кол-ва countEnemies и выйдем из цикла.

            } while (!isEmptyRoom(xPosEnemy, yPosEnemy));

            location[yPosEnemy][xPosEnemy] = enemy;                     // расстановка врага по случайным координатам
        }
        System.out.println("Enemy count is " + countEnemies + ", HP = " + healthEnemy + ", STR = " + strEnemy);  //вывод сообщения о кол-ве, силе, и здоровье врагов

    }


    public static void directionPlayer () {                             // метод для движения героя
        int currentX = xPosPlayer;                                      //* текущие координаты, по которым расположен герой в разные моменты игры
        int currentY = yPosPlayer;                                      //* и если герой вывалится за массив, он вернется на текущие координаты

        int playerMoveValue;                                            // переменная, принимающая введенное игроком занчение (2,6,4,8)

        do {
            System.out.print("Enter destination: (UP=" + moveUpPlayer + " | DOWN=" + moveDownPlayer +           //сообщение для пользователя
                    " | LEFT=" + moveLeftPlayer + " | RIGHT= " + moveRightPlayer + ") >>>");
            playerMoveValue = scanner.nextInt();                        // ввод в консоли значения 2,4,6,8
            switch (playerMoveValue) {                                  // в зависимости от хода игрока передвигаем героя по направлениям
                case moveUpPlayer:
                    yPosPlayer -=1;
                    break;
                case moveDownPlayer:
                    yPosPlayer +=1;
                    break;
                case moveLeftPlayer:
                    xPosPlayer -=1;
                    break;
                case moveRightPlayer:
                    xPosPlayer +=1;
                    break;
            }
        } while (!isValidMovePlayer(currentX, currentY, xPosPlayer, yPosPlayer));   // игрок будет ходить до тех пор, пока ход будет валидным, т.е.
        playerNextMovePlayer(currentX, currentY, xPosPlayer, yPosPlayer);           // тру из метода isValidMovePlayer. запускается метод  хода героя

    }

    public static void playerNextMovePlayer(int lastX, int lastY, int nextX, int nextY) {  // метод ход героя
        if (location[nextY][nextX] ==enemy) {                                              //* если в ячейке, куда пошел герой - враг, то у героя
            healthPlayer -= strEnemy;                                                      //*отнимается здоровье равное силе врага
            System.out.println("Warning!  Enemy give damage to " + namePlayer
                    + "is" + strEnemy + "." + namePlayer + "health is " + healthPlayer);
            System.out.println("Count enemies is " + countEnemies);
        }
        location[lastY][lastX]=readyRoom;                                                  //если герой был в комнате, ей присваивается readyRoom
        location[nextY][nextX]=player;                                                     //изменились координаты героя

    }

    public static boolean isValidMovePlayer(int currentX, int currentY, int nextX, int nextY) {    //*метод проверяет не вышел ли герой за рамки массива
        if (nextX >=0 && nextX < locWight && nextY >=0 && nextY < locHeight) {                     //если координата больше нуля и меньше Ш или В, то
            System.out.println(namePlayer + "move to [ " + nextX + ":" + nextY + "]");             // в метод движения героя возвращается тру и выводится
            return true;                                                                           //* сообщение в консоли о ходе игрока
        }else {
            System.out.println("Invalid move! Try again");                                         //* если условие не выполняется, то возврат на текущие
            xPosPlayer = currentX;                                                                 // координаты и сообщение об ошибке и в метод движения
            yPosPlayer = currentY;                                                                 //* героя возвращается фолс
            return false;
        }
    }
    public static boolean isEmptyRoom (int x, int y) {                    // метод, возвращающий true или false, проверяет пустая комната или нет
        return location[y][x] == emptyRoom;
    }

    public static void printLocation () {                                 // метод для печати карты
        System.out.println("=====> MAP <====");
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWight; x++) {
                System.out.print(location[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("================");
    }

    public static int myRandomValueInt ( int min, int max){                // метод-инструмент для рандома
        return min + random.nextInt(max - min + 1);
    }
    public static boolean isAliveplayer () {                               // метод, возврашает тру если герой жив (здоровье больше нуля)
        return healthPlayer > 0;
    }
    public static boolean isReadyLocation () {                             // метод, проверяет пустые ячейки, в которых не был игрок, и возвращает фолс
        for (int y = 0; y < locHeight; y++) {
            for (int x = 0; x < locWight; x++) {
                if (location[y][x] == emptyRoom) {
                    return false;
                }
            }
        }
        return  true;
    }
}



