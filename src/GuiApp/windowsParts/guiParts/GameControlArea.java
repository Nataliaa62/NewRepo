package GuiApp.windowsParts.guiParts;
import javax.swing.*;
import java.awt.*;

public class GameControlArea extends JPanel {
    private JLabel areaName;   // обозначаем компоненты
    private JButton btnStartGame;
    private JButton btnEndGame;


    public GameControlArea (){
        setLayout(new GridLayout(3,1));    //создаем компоненты
        areaName = new JLabel("==GAME CONTROL==", SwingConstants.CENTER);
        btnStartGame = new JButton("Launch Game");
        btnEndGame = new JButton("Exit Game");

       add(areaName);                                // добавляем компоненты
       add(btnStartGame);
       add(btnEndGame);

    }
}
