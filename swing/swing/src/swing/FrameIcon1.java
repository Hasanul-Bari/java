package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameIcon1 extends JFrame {

    private ImageIcon icon;

    FrameIcon1() {

        icon = new ImageIcon(getClass().getResource("ab.png"));
        this.setIconImage(icon.getImage());
    }

    

    public static void main(String[] args) {

        FrameIcon1 fr = new FrameIcon1();
        
        /*ImageIcon icon = new ImageIcon("ab.png");
        
        fr.setIconImage(icon.getImage());*/

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(200, 50, 400, 400);
        fr.setTitle("Title");
        fr.setResizable(false);

    }

}
