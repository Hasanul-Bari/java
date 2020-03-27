
        
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo1 extends JFrame {

    private Container c;
    private JPasswordField pf;
    private Font f;
    

    JPasswordFieldDemo1() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        f=new Font("Arial",Font.BOLD,22);
        
        pf=new JPasswordField();
        pf.setBounds(50, 50, 150, 50);
        pf.setEchoChar('*');
        
        pf.setFont(f);
        
        pf.setForeground(Color.yellow);
        pf.setBackground(Color.RED);
        
        
        
        
        c.add(pf);

       

    }

    

    public static void main(String[] args) {

        JPasswordFieldDemo1 fr = new JPasswordFieldDemo1();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value
        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("Title");
        fr.setResizable(false);
    }

}
