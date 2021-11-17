package GuiApp.windowsParts.guiParts;
import less4.GameCom;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {
    private JLabel areaName;
    private JLabel countEnemies;
    private JLabel healthEnemy;
    private JLabel strEnemy;   // обозначаем компоненты




    public GameInfoArea() {
        setLayout(new GridLayout(4, 1));    //создаем компоненты
        areaName = new JLabel("<html><b>==ENEMY INFO==</b></html>", SwingConstants.CENTER);
        countEnemies = new JLabel("Count of enemies = " + GameCom.countEnemies, SwingConstants.CENTER);
        healthEnemy = new JLabel("Enemy health = " + GameCom.healthEnemy , SwingConstants.CENTER);
        strEnemy = new JLabel("Enemy Strength = " + GameCom.strEnemy, SwingConstants.CENTER);



        add(areaName);
        add(countEnemies);
        add(healthEnemy);
        add(strEnemy);                                // добавляем компоненты



    }
}
