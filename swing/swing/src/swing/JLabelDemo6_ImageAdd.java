
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo6_ImageAdd extends JFrame {

    private ImageIcon icon,img;
    private Container c;
    private JLabel jlb;   
   

    JLabelDemo6_ImageAdd() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);

        img=new ImageIcon(getClass().getResource("hp.jpg"));

        jlb = new JLabel(img);               
        
        jlb.setBounds(100, 150, img.getIconWidth(), img.getIconHeight());
      
        c.add(jlb);

        
        
        icon = new ImageIcon(getClass().getResource("ab.png"));
        this.setIconImage(icon.getImage());
        
   
    }

    public static void main(String[] args) {

        JLabelDemo6_ImageAdd fr = new JLabelDemo6_ImageAdd();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("Title");
        fr.setResizable(false);

    }

}

        