package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionDemo5_JCheckBox extends JFrame {

    private Container c;
    private JCheckBox cb1,cb2,cb3;
    
    private ButtonGroup grp;
    
    private JLabel lb;
  
   
    private Font f;
            
    
   
  
    ActionDemo5_JCheckBox() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        
        cb1= new JCheckBox("Java");
        cb1.setBounds(50,50,200,50);
        cb1.setFont(f);
        c.add(cb1);
        
        cb2= new JCheckBox("C");
        cb2.setBounds(50,110,200,50);
        cb2.setFont(f);
        c.add(cb2);
        
        cb3= new JCheckBox("Python");
        cb3.setBounds(50,170,200,50);
        //cb3.setSelected(true);
        cb3.setFont(f);
        c.add(cb3);
        
        
        grp=new ButtonGroup();
        grp.add(cb1);
        grp.add(cb2);
        grp.add(cb3);
        
        
        lb=new JLabel("You haven't selected any");
        lb.setBounds(50,300,300,50);;
        lb.setFont(f);
        c.add(lb);
        
        
        Handler handler = new Handler();
        cb1.addActionListener(handler);
        cb2.addActionListener(handler);
        cb3.addActionListener(handler);
        
        
   
    }
    
    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)
        {
               if(cb1.isSelected())             
               {
                   lb.setText("You have selected Java\n");
               }
               else if(cb2.isSelected())
               {
                   lb.setText("You have selected C\n");
               }
               else
               {
                   lb.setText("You have selected Python\n");
               }
        }

    }

    public static void main(String[] args) {

        ActionDemo5_JCheckBox fr = new ActionDemo5_JCheckBox();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("Check Box");
        fr.setResizable(false);

    }

}

        