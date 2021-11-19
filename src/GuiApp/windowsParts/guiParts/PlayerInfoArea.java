package GuiApp.windowsParts.guiParts;
import less4.GameCom;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {
    private JLabel areaName;
    private JLabel namePlayer;
    private JLabel healthPlayer;   // обозначаем компоненты
    private JLabel strPlayer;
    private JLabel position;
    private JLabel line;


    public PlayerInfoArea() {
        setLayout(new GridLayout(6, 1));    //создаем компоненты
        areaName = new JLabel("<html><b>==PLAYER INFO==</b></html>", SwingConstants.CENTER);
        namePlayer = new JLabel("Name of Player - " + GameCom.namePlayer, SwingConstants.CENTER);
        healthPlayer = new JLabel("HP of " + GameCom.namePlayer + " = " + GameCom.healthPlayer, SwingConstants.CENTER);
        strPlayer = new JLabel("STR of " + GameCom.namePlayer + " = " + GameCom.strPlayer, SwingConstants.CENTER);
        position = new JLabel("Position " + GameCom.xPosPlayer + " : " + GameCom.yPosPlayer, SwingConstants.CENTER);
        line = new JLabel("_____________________________", SwingConstants.CENTER);


        add(areaName);
        add(namePlayer);
        add(healthPlayer);                                // добавляем компоненты
        add(strPlayer);
        add(position);
        add(line);


    }
}
