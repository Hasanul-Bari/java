package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo1 extends JFrame {

    private Container c;
    private JPanel p1,p2;
    
    private JButton btn1,btn2,btn3;
   

    JPanelDemo1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        
        p1=new JPanel();
        p1.setBounds(50,100,200,300);
        p1.setBackground(Color.yellow);
        p1.add(btn1);
        c.add(btn3);  //*****
        c.add(p1);

        
        p2=new JPanel();
        p2.setBounds(300,100,200,300);
        p2.setBackground(Color.yellow);
        p2.add(btn2);
        c.add(p2);

       
        
        
        
        
   
        
   

    }

    public static void main(String[] args) {

        JPanelDemo1 fr = new JPanelDemo1();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("JPanelDemo");
        fr.setResizable(false);
    }
}
