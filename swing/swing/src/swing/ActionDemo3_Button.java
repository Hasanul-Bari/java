package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionDemo3_Button extends JFrame {
    
    private Container c;
    private JButton  btn;
    private JTextField tf;
    
    
    
    ActionDemo3_Button(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        tf=new JTextField();
        tf.setBounds(100,50,250,50);
        
        c.add(tf);
        
        
        
        
        btn=new JButton("Clear");
        btn.setBounds(175,120,100,50);
        c.add(btn);
        
        btn.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("");
            }
        });
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        ActionDemo3_Button fr=new ActionDemo3_Button();
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400,150,600,500);
        fr.setTitle("Button demo");
        fr.setResizable(false);
        
        
        
    }
    
}
