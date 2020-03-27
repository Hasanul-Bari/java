package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JScrollPaneDemo extends JFrame {
    
    private Container c;
    private JTextArea ta;
    private Font f;
    
    private JScrollPane scroll;
    
    JScrollPaneDemo(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f=new Font("Arial",Font.BOLD,20);
        
        ta=new JTextArea();
        
        ta.setFont(f);
        ta.setBackground(Color.CYAN);
        ta.setForeground(Color.DARK_GRAY);
        
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        
        scroll =new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(50,50,300,300);
        c.add(scroll);
        
        
        
        
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        JScrollPaneDemo fr=new JScrollPaneDemo();
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400,150,600,500);
        fr.setTitle("Text Area");
        fr.setResizable(false);
    }
    
}
