package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{
    
    private GridLayout gl;
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;

   
   GridLayoutDemo(){
       
       c = this.getContentPane();
       
       gl=new GridLayout(2,2,10,5);
       
       
       c.setLayout(gl);
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
        
        GridLayoutDemo fr = new GridLayoutDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("BoxLayoutDemo");
        fr.setResizable(false);
    }
    
}

