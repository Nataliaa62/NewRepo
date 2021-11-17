package GuiApp;

import GuiApp.windowsParts.GameMap;
import GuiApp.windowsParts.GuiPanel;

import javax.swing.*;
import java.awt.*;


    public class GameGui extends JFrame {     // создаем класс основного окна программы и наследуем класс JFrame , который позволит настраивает окно под нас
        private int windowWidht = 1300;          // задаем размеры окна
        private int windowHeight = 768;
        private int windowPosX = 300;            // поумолчанию координата 0:0. Мы сейчас указали явно, где будет начинаться окно
        private int windowPosY = 100;
        private String windowTitle = "Title";    // наименование окна
        private GuiPanel guiPanel;
        private GameMap gameMap;


        GameGui () {
            setupWindow();

            guiPanel = new GuiPanel();            // создаем Панель и Карту Приложения
            gameMap = new GameMap();

            add(gameMap);                         // добавляем карту и панель в окно
            add(guiPanel, BorderLayout.EAST);

            setVisible(true);                                  // Для видимости окна, необходима последовательность данной операции (после всех остальных)


        }
        private  void setupWindow () {                                        // создаем метод настройки окна
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);          // Для операции закрытия окна. несколько вариантов закрытия:
            // закрыть и скрыть, разрушить, выйти. н-р сейчас мы закрыли и вышли из программыsetSize(windowWidht, windowHeight);                               // устанавливаем заданные размеры
            setLocation(windowPosX, windowPosY);                              // задаем координаты начала окна при запуске
            setSize(windowWidht, windowHeight);
            setTitle(windowTitle);                                            // задаем наименование окна
            setResizable(false);                                              // запрещает менять размер окна пользователем

        }
}
