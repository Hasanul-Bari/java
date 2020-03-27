package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class JTextAreaDemo1 extends JFrame {
    
    private Container c;
    private JTextArea ta;
    private Font f;
    
    JTextAreaDemo1(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f=new Font("Arial",Font.BOLD,20);
        
        ta=new JTextArea();
        ta.setBounds(50,50,300,300);
        ta.setFont(f);
        ta.setBackground(Color.CYAN);
        ta.setForeground(Color.DARK_GRAY);
        
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        c.add(ta);
        
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        JTextAreaDemo1 fr=new JTextAreaDemo1();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400,150,600,500);
        fr.setTitle("Text Area");
        fr.setResizable(false);
    }
    
}
