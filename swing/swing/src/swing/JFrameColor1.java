package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameColor1 extends JFrame {

    private ImageIcon icon;
    private Container c;

    JFrameColor1() {
        
        c=this.getContentPane();
        c.setBackground(Color.RED);
        
        
        
        icon = new ImageIcon(getClass().getResource("ab.png"));
        this.setIconImage(icon.getImage());
    }

    

    public static void main(String[] args) {

        JFrameColor1 fr = new JFrameColor1();
        
        /*ImageIcon icon = new ImageIcon("ab.png");
        
        fr.setIconImage(icon.getImage());*/
        
        /*Container c=fr.getContentPane();
        c.setBackground(Color.DARK_GRAY);*/
        

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(200, 50, 400, 400);
        fr.setTitle("Title");
        fr.setResizable(false);

    }

}
