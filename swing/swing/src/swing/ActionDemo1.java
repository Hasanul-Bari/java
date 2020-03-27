package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ActionDemo1 extends JFrame{
    
    private Container c;
    private JTextField tf1,tf2;
    
    ActionDemo1(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);
        
        tf1=new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);
        
        tf2=new JTextField();
        tf2.setBounds(50, 150, 150, 50);
        c.add(tf2);
        
        tf1.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e){
                
                String s=tf1.getText();
                if(s.isEmpty())
                    JOptionPane.showMessageDialog(null,"Enter some text");
                else
                    JOptionPane.showMessageDialog(null,"tf1 = "+s);
                
            }
            
        });
        
        
        
        tf2.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e){
                
                String s=tf2.getText();
                if(s.isEmpty())
                    JOptionPane.showMessageDialog(null,"Enter some text");
                else
                    JOptionPane.showMessageDialog(null,"tf2 = "+s);
                
            }
            
        });
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        ActionDemo1 fr=new ActionDemo1();
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("JTestDemo");
        fr.setResizable(false);
    }
    
}
