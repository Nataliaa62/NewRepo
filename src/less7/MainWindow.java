package less7;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class MainWindow extends JFrame {     // создаем класс основного окна программы и наследуем класс JFrame , который позволит настраивает окно под нас
    private int windowWidht = 1024;          // задаем размеры окна
    private int windowHeight = 768;
    private int windowPosX = 300;            // поумолчанию координата 0:0. Мы сейчас указали явно, где будет начинаться окно
    private int windowPosY = 100;
    private String windowTitle = "Title";    // наименование окна

    // Создаем кнопку
    private JButton btnStartGame;            // за создание кнопки отвечает JButton. Для выбора можно в комбинациях с тектом, иконкой, анимацией и т.д.
    private JButton btnExitGame;
    private JPanel container;                // JPanel компоненты-контерйнеры, которые будут содержать другие компоненты

    MainWindow() {
        setupWindow();
        container = new JPanel();                            // создаем контейнер
        btnStartGame = new JButton("Launch Game");
        btnExitGame = new JButton("Exit Game");

        container.setLayout(new GridLayout(2,1));
        container.add(btnStartGame);                          // добавляем в контейнер кнопки
        container.add(btnExitGame);

        add(container, BorderLayout.WEST);                    // добавляем сам контейнер и располагаем его слева
        // setLayout(new GridLayout(15, 10));                 // Менеджер расположения GridLayout представляет контейнер в виде таблицы с ячейками одинакового размера
        // setLayout(new FlowLayout ());                      // Менеджер расположения FlowLayout размещает компоненты в контейнере слева направо, сверху вниз
        // for (int i = 0; i < 30; i++) {                     // ячейки автоматически
        //    add(new JButton(("Button" + i)));
        //  }


        // add(btnStartGame, BorderLayout.SOUTH);          // Добавление компонента выполняется с помощью метода add,  BorderLayout отвечает
        // add(btnExitGame, BorderLayout.WEST);            // за расположение. по умолчанию кнопка была бы в центре




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
