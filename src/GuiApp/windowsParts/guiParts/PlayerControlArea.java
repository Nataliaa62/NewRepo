package GuiApp.windowsParts.guiParts;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.net.URL;



public class PlayerControlArea extends JPanel {
    private JButton empty;
    private JButton emptyTwo;
    private JButton up;
    private JButton down;
    private JButton left;
    private JButton right;
    private ImageIcon icon1;



    public PlayerControlArea () {
        setLayout(new GridLayout(2, 3));
        empty = new JButton(" ");

        JButton up = new JButton();
        ImageIcon icon1 = createIcon("images/Up.png");
        up.setIcon(icon1);

        emptyTwo = new JButton(" ");


        JButton left = new JButton();
        ImageIcon icon3 = createIcon("images/Left.png");
        left.setIcon(icon3);


        JButton down = new JButton();
        ImageIcon icon2 = createIcon("images/Down.png");
        down.setIcon(icon2);

        JButton right = new JButton();
        ImageIcon icon4 = createIcon("images/Right.png");
        right.setIcon(icon4);



        add(empty);
        add(up);
        add(emptyTwo);

        add(left);
        add(down);
        add(right);
    }

    protected static ImageIcon createIcon(String path) {
        URL imgURL = PlayerControlArea.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
