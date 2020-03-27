package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo5_Tips_To_JLabel extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel jlb, jlb2;   
    private Font f;

    JLabelDemo5_Tips_To_JLabel() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);

        f = new Font("Arial", Font.ITALIC, 14);   

        jlb = new JLabel();               
        jlb.setText("Enter Your Name :");
        jlb.setBounds(100, 150, 200, 20);
        jlb.setFont(f);
        jlb.setForeground(Color.BLUE);              
        jlb.setOpaque(true);
        jlb.setBackground(Color.cyan);
        jlb.setToolTipText("Write full name");    // tip dekhabe label e cursor niye gele
        c.add(jlb);
        
        System.out.println(jlb.getText());         // label ar text return krbe
        System.out.println(jlb.getToolTipText());   // tip ar text return krbe
        

        jlb2 = new JLabel();
        jlb2.setText("Enter your password :");
        jlb2.setBounds(100, 200, 200, 20);
        c.add(jlb2);

        icon = new ImageIcon(getClass().getResource("ab.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {

        JLabelDemo5_Tips_To_JLabel fr = new JLabelDemo5_Tips_To_JLabel();

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
