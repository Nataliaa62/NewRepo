package GuiApp.windowsParts;

import GuiApp.windowsParts.guiParts.GameControlArea;
import GuiApp.windowsParts.guiParts.GameInfoArea;
import GuiApp.windowsParts.guiParts.PlayerControlArea;
import GuiApp.windowsParts.guiParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;


public class GuiPanel extends JPanel {
    private GameControlArea gameControlArea;         // обозначаем компоненты
    private GameInfoArea gameInfoArea;
    private PlayerControlArea  playerControlArea;
    private PlayerInfoArea playerInfoArea;

    private JTextArea gameLog;                      // обозначаем пятый компонент - лог
    private JScrollPane scrollLog ;                            // для скролла


   public GuiPanel() {
       prepare();                                   // метод предустановки - цвет и размер столоб и строк
       createParts();                               // создание компонент
       prepareLog();                                // создание лога
       add(gameControlArea);
       add(playerInfoArea);
       add(gameInfoArea);
       add(playerControlArea);
       add(scrollLog);






   }

    private void prepare() {
        setBackground(Color.ORANGE);      // Задаем цвет
        setLayout(new GridLayout(5,1));
    }

    private void prepareLog() {
        gameLog = new JTextArea("LOG");
        scrollLog = new JScrollPane(gameLog);        // отдаем под управление скролла область лог
    }

    private void createParts() {
        gameControlArea = new GameControlArea();         // создаем непосредственно компоненты
        gameInfoArea = new GameInfoArea();
        playerControlArea = new PlayerControlArea();
        playerInfoArea = new PlayerInfoArea();
    }

}
