package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo extends JFrame {
    
    private Container c;
    private Font f;
    private Cursor cr;
    private JButton  btn1,btn2;
    
    private ImageIcon img;
    
    JButtonDemo(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f=new Font("Arial",Font.ITALIC,20);
        
        
        cr=new Cursor(Cursor.HAND_CURSOR);
        
        img =new ImageIcon(getClass().getResource("hp.jpg"));
        
        
       
        
        btn1=new JButton("Submit");
        btn1.setBounds(100,50,100,50);
        btn1.setFont(f);
        
        btn1.setForeground(Color.BLUE);
        btn1.setBackground(Color.RED);
        
        btn1.setCursor(cr);
        
        c.add(btn1);
        
        btn2=new JButton(img);
        c.add(btn2);   //add krar pore customize krleo hbe
        
        btn2.setBounds(250,50,100,50); 
        
        
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        JButtonDemo fr=new JButtonDemo();
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400,150,600,500);
        fr.setTitle("Button demo");
        fr.setResizable(false);
        
        
        
    }
    
}
