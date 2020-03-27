package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo1 extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel jlb;   //declare

    JLabelDemo1() {
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        jlb = new JLabel();               // create the label
        jlb.setText("Enter Your Name");
        jlb.setBounds(100,150,200,20);
        c.add(jlb);
        
        
        
        
        icon = new ImageIcon(getClass().getResource("ab.png"));
        this.setIconImage(icon.getImage());
    }

    

    public static void main(String[] args) {

        JLabelDemo1 fr = new JLabelDemo1();
        
        /*ImageIcon icon = new ImageIcon("ab.png");
        
        fr.setIconImage(icon.getImage());
        
        Container c=fr.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        JLabel jlb=new JLabel();
        jlb.setText("Enter your name : ");
        jlb.setBounds(50,100,200,20);
        c.add(jlb);*/
        
        

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(200, 50, 400, 400);
        fr.setTitle("Title");
        fr.setResizable(false);

    }

}
