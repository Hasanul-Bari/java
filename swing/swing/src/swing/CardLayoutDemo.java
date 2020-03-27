package swing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener{
    
    private CardLayout cl;
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;

   
   CardLayoutDemo(){
       
       c = this.getContentPane();
       
       cl=new CardLayout(100,100);
       
       
       c.setLayout(cl);
       c.setBackground(Color.magenta);
       
       btn1=new JButton("1");
       btn2=new JButton("2");
       btn3=new JButton("3");
       btn4=new JButton("4");
       btn5=new JButton("5");
       
       c.add(btn1,"1");
       
       c.add(btn2,"2");
       c.add(btn3,"3");
       c.add(btn4,"4");
       c.add(btn5,"5");
       
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
       btn4.addActionListener(this);
       btn5.addActionListener(this);
       
       
               
   }
   
   @Override
    public void actionPerformed(ActionEvent e) {
    
       cl.next(c);
       //cl.previous(c);
       
       //cl.show(c, "4");  // specifically otai dekhabe
    }
    

    public static void main(String[] args) {
        
        CardLayoutDemo fr = new CardLayoutDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("CardLayoutDemo");
        fr.setResizable(false);
    }

    
    
    
}

