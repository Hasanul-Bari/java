package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo3_FontStyle_Size extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel jlb, jlb2;   //declare
    private Font f;

    JLabelDemo3_FontStyle_Size() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);

        f = new Font("Arial", Font.ITALIC, 14);   // font toiri hoye gelo,ata jekno label a use kra jabe

        jlb = new JLabel();               // create the label
        jlb.setText("Enter Your Name :");
        jlb.setBounds(100, 150, 200, 20);
        jlb.setFont(f);
        c.add(jlb);

        jlb2 = new JLabel();
        jlb2.setText("Enter your password :");
        jlb2.setBounds(100, 200, 200, 20);
        c.add(jlb2);

        icon = new ImageIcon(getClass().getResource("ab.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {

        JLabelDemo3_FontStyle_Size fr = new JLabelDemo3_FontStyle_Size();

        /*ImageIcon icon = new ImageIcon("ab.png");
        
        
        fr.setIconImage(icon.getImage());
        
        Container c=fr.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        Font f=new Font("Arial",Font.HANGING_BASELINE,14);
        
        JLabel jlb=new JLabel();
        jlb.setText("Enter your name : ");
        jlb.setBounds(50,100,200,20);
        jlb.setFont(f);
        c.add(jlb);*/
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("Title");
        fr.setResizable(false);

    }

}
