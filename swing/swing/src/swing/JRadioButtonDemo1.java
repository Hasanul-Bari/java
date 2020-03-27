package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonDemo1 extends JFrame {

    private Container c;
    private JRadioButton rb1,rb2;
    private ButtonGroup grp;
    
    private Font f;
            
    
   
  
    JRadioButtonDemo1() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.BOLD,20);
        
        rb1=new JRadioButton("male");
        rb1.setBounds(50,50,100,50);
        rb1.setFont(f);
        rb1.setSelected(true);   // suru thekei select hoye thakbe
        c.add(rb1);
        
        
        rb2=new JRadioButton("female");
        rb2.setBounds(200,50,100,50);
        rb2.setFont(f);
        rb2.setEnabled(false);   //disable kre dibe
        c.add(rb2);
        
        grp=new ButtonGroup();
        grp.add(rb1);
        grp.add(rb2);

       
   
    }

    public static void main(String[] args) {

        JRadioButtonDemo1 fr = new JRadioButtonDemo1();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("Radio Button");
        fr.setResizable(false);

    }

}

        