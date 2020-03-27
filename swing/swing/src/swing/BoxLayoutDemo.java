package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame{
    
    private BoxLayout bl;
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;

   
   BoxLayoutDemo(){
       
       c = this.getContentPane();
       
       bl=new BoxLayout(c,BoxLayout.Y_AXIS);
       
       
       c.setLayout(bl);
       c.setBackground(Color.magenta);
       
       btn1=new JButton("1");
       btn2=new JButton("2");
       btn3=new JButton("3");
       btn4=new JButton("4");
       btn5=new JButton("5");
       
       c.add(btn1);
       
       c.add(btn2);
       c.add(btn3);
       c.add(btn4);
       c.add(btn5);
       
       
               
   }
    

    public static void main(String[] args) {
        
        BoxLayoutDemo fr = new BoxLayoutDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("BoxLayoutDemo");
        fr.setResizable(false);
    }
    
}

