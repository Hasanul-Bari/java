package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame{
    
    private BorderLayout bl;
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;

   
   BorderLayoutDemo(){
       
       bl=new BorderLayout();
       
       bl.setHgap(100);
       bl.setVgap(5);
       
       c = this.getContentPane();
       c.setLayout(bl);
       c.setBackground(Color.magenta);
       
       btn1=new JButton("1");
       btn2=new JButton("2");
       btn3=new JButton("3");
       btn4=new JButton("4");
       btn5=new JButton("5");
       
       c.add(btn1,BorderLayout.NORTH);
       c.add(btn2,BorderLayout.SOUTH);
       c.add(btn3,BorderLayout.CENTER);
       c.add(btn4,BorderLayout.EAST);
       c.add(btn5,BorderLayout.WEST);
       
       
               
   }
    

    public static void main(String[] args) {
        
        BorderLayoutDemo fr = new BorderLayoutDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("BorderLayoutDemo");
        fr.setResizable(false);
    }
    
}

