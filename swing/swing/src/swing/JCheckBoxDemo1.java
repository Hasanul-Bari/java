package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxDemo1 extends JFrame {

    private Container c;
    private JCheckBox cb1,cb2,cb3;
    
    private ButtonGroup grp;
  
   
    private Font f;
            
    
   
  
    JCheckBoxDemo1() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        
        cb1= new JCheckBox("Java");
        cb1.setBounds(50,50,200,50);
        cb1.setFont(f);
        c.add(cb1);
        
        cb2= new JCheckBox("C",true);
        cb2.setBounds(50,110,200,50);
        cb2.setFont(f);
        c.add(cb2);
        
        cb3= new JCheckBox("Phython");
        cb3.setBounds(50,170,200,50);
        //cb3.setSelected(true);
        cb3.setFont(f);
        c.add(cb3);
        
        
        grp=new ButtonGroup();
        grp.add(cb1);
        grp.add(cb2);
        grp.add(cb3);
        
        
   
    }

    public static void main(String[] args) {

        JCheckBoxDemo1 fr = new JCheckBoxDemo1();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("Check Box");
        fr.setResizable(false);

    }

}

        